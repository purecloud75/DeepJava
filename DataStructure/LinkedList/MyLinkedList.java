package LinkedList;

import java.util.ListIterator;

public class MyLinkedList {

    private Node head;
    private Node tail;
    private int size = 0;  // 이 리스트에 몇개의 노드가 있는가

    private class Node {
        private Object data;
        private Node next;  //다음 노드의 참조값(주소)를 저장하는 곳

        public Node(Object input) {
            this.data = input;
            this.next = null;
        }

        public String toString() {
            return String.valueOf(this.data);
        }
    }

    public void addFirst(Object input) {
        Node newNode = new Node(input);
        newNode.next = head;  //2번째서부터 쓰이는데, 지금생성한 객체가 이전생성객체를 가리키기 위한 조치. 이전생성객체가 head 에 있으니
        head = newNode;  //이 head 가 방금생성한 객체를 가리킨다. 내가 내 주소값 줄테니까 넌 나 가르켜야 돼. 알았지?
        size++;
        if (head.next == null) {
            tail = head;
        }
    }

    public void addLast(Object input) {
        Node newNode = new Node(input);
        if (size == 0) {
            addFirst(input);
        } else {
            tail.next = newNode;  //else 에 최초로 들어왔다는건 2번째경우, 즉 머리와 꼬리가 같은 단 하나의 객체를 바라보는 직후부터.
            tail = newNode;  //tail.next 는 그 꼬리가 가리키는 생성객체의 next 를 맒하는 것이고, tail 은 그냥 꼬리일 뿐임.
            size++;
        }
    }

    Node node(int index) {
        Node x = head;
        for (int i = 0; i < index; i++) {
            x = x.next;
            //리턴받고자하는 데이터의 인덱스번호가 곧 반복횟수가 된다. 0 1 2 ... 순으로 인덱스 형성되어있는거임
        }
        return x;
    }

    public void add(int k, Object input) {
        if (k == 0) {
            addFirst(input);
        } else {
            Node temp1 = node(k - 1);  //2번인덱스(3번째객체)에 넣고싶다면 바로이전인 1번인덱스의 주소를 알아야 한다.
            Node temp2 = temp1.next;  //temp1, temp2 는 그냥 노드를 가리키고 바라보는 해바라기 팬 같은거임 그냥.
            Node newNode = new Node(input);
            temp1.next = newNode;  //내가 내 주소값 줄테니까 넌 나 가르켜야 돼. 알았지?
            newNode.next = temp2;
            size++;
            if (newNode.next == null) {
                tail = newNode;
                //마지막에 추가하는 것이어도 2nd 줄에서 null 을 할당, 5th 줄에서 null 을 할당할 뿐 아무런 문제없이 추가가 가능하다.
            }
        }
    }

    public String toString() {
        if (head == null) {
            return "[]";
        }
        Node temp = head;
        String str = "[";
        while (temp.next != null) {
            str += temp.data + ",";
            temp = temp.next;
        }
        str += temp.data;
        return str + "]";
    }

    public Object removeFirst() {
        Node temp = head;
        head = head.next;  //두번째노드의 주소를 헤드변수에 할당한다. 즉 헤드변수가 두번째노드를 가리킨다.
        Object returnData = temp.data;  //삭제하고자하는 노드의 값을 저장한 후
        temp = null;  //head 는 이미 두번째노드를 가리키고있고, temp 마저 참조를 끊어버리니 첫번째노드는 잊혀지고 리스트에서 소외된다.
        size--;
        return returnData;  //통상적으로 remove 한 노드의 데이터를 반환하도록 설계된다.
    }

    public Object remove(int k) {
        if (k == 0) {
            return removeFirst();
        }
        Node temp = node(k - 1);  //삭제하려고하는 노드의 이전노드를 temp 가 가리키게해서 그것의 넥스트를 저 변수에 할당한다.
        Node todoDeleted = temp.next;
        temp.next = temp.next.next;  //두 칸 건너 한번에 가리키게한다. 패싱스루.
        Object returnData = todoDeleted.data;
        if (todoDeleted == tail) {
            tail = temp;
        }
        todoDeleted = null;
        size--;
        return returnData;
    }

    public Object removeLast() {
        return remove(size - 1);
    }

    public int size() {
        return size;
    }

    public Object get(int k) {
        Node temp = node(k);
        return temp.data;
    }

    public int indexOf(Object data) {
        Node temp = head;
        int index = 0;
        while (temp.data != data) {
            temp = temp.next;
            index++;
            if (temp == null) {  //마지막노드까지 왔다면 == 연결리스트에서 매개변수로 받은 데이터가 없다면
                return -1;
            }
        }
        return index;
    }

    public ListIterator listIterator() {
        return new ListIterator();
    }

    class ListIterator {
        private Node lastReturned;
        private Node next;
        public int nextIndex;

        ListIterator() {
            this.next = head;
        }

        public Object next() {  //현재 next 변수가 가리키고 있는 엘리먼트(노드)를 리턴합니다. 그리고 next 는 다음노드를 가리킵니다.
            lastReturned = this.next;
            this.next = this.next.next;
            nextIndex++;  //얘는 next 가 가리키는 노드 즉, 다음노드의 인덱스를 의미하게 된다. 동시에 지금껏 리턴한 갯수를 의미한다.
            return lastReturned.data;
        }

        public boolean hasNext() {
            return nextIndex < size();
        }

        public void add(Object input) {
            Node newNode = new Node(input);
            if (lastReturned == null) {  //처음에 추가한다면
                head = newNode;
                newNode.next = this.next;
                //기존의 첫번째 노드의주소를 새로운 첫번째노드의 next 에 할당하여 기존을 가리키게 한다.
            } else {  //중간에 추가한다면
                lastReturned.next = newNode;
                newNode.next = this.next;
            }
            lastReturned = newNode;
            nextIndex++;
            size++;
        }

        public void remove() {
            if (nextIndex == 0) {  //노드가 하나도 없을때
                throw new IllegalStateException();
            }
            MyLinkedList.this.remove(nextIndex - 1);
            //삭제하고자하는 노드는 바로 lastReturned 가 가리키는 노드이다. nextIndex = lastReturned + 1이므로 매개값을 저렇게 함
            nextIndex--;
        }
    }
}
