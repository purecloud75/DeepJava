package LinkedList;

public class Test2 {
    public static void main(String[] args) {

        MyLinkedList numbers = new MyLinkedList();

        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);

        MyLinkedList.ListIterator i = numbers.listIterator();

        i.add(5);
        i.next();
        i.add(15);
        System.out.println(numbers);

        while (i.hasNext()) {
            if ((int) i.next() == 20) {
                i.remove();
            }
        }
        //이 과정에서 반복문을 통해서 우리가 원하는 노드의 위치를 찾은상태에서 remove()를 합니다. 그러면 리무브 내부적으로 node()메소드를
        //사용해서 다시 노드를 찾는 작업을 하는거예요. 이미 찾았는데. 비효율적인거죠. 우리가 삭제하고자하는 노드는 lastReturned 가
        //가리키는 노드입니다. 얘를 삭제하고싶으면 연결을 제거하는게 삭제이므로, 바로 이전노드가 누군지를 알아야하고 그 이전노드의 넥스트
        //값을, 삭제하고자하는 노드의 다음노드(넥스트가 가리키는 노드)의 주소로 하면 되는것이죠. 하지만 우리는 라스트리턴드값만 알고있지
        //바로 이전노드의 주소는 알지못합니다. 즉 처음 헤드서부터 쭉 찾아서 삭제를 하는 remove()를 쓴것이죠.
        //만약 여기서 라스트리턴드노드에 이전노드의 주소값을 알고있다면(이중연결 리스트) 2번 탐색할 거 한번으로 줄이는거죠. 효율적이다.

        System.out.println(numbers);
    }
}
