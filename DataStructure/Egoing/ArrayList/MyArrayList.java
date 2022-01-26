package Egoing.ArrayList;

public class MyArrayList {

    private int size = 0;  //배열에 몇 개의 데이터들이 채워져있는가를 나타냄
    private Object[] elementData = new Object[100];

    public boolean addLast(Object element) {
        elementData[size] = element;
        size++;
        return true;
    }

    public boolean add(int index, Object element) {
        for (int i = size - 1; i >= index; i--) {
            elementData[i + 1] = elementData[i];  //size = 4 이기에 3번째를 4번째로 옮기고 이를  i = index 일때까지 반복.
        }
        elementData[index] = element;  //다 한칸씩 옮기고나서 비어진 공간(index 번 공간이 비어있겠지)에 대입한다.
        size++;
        return true;
    }

    public boolean addFirst(Object element) {
        return add(0, element);
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < size; i++) {  // 마지막인덱스는 size - 1이므로, i < size 로써 전체를 순회한다.
            str += elementData[i];
            if (i < (size - 1))  // 마지막인덱스 바로전까지만 ', '를 붙일 것이기에, i < size -1 로 쓴다.
                str += ", ";
        }
        return str + "]";
    } //모든 클래스가 상속하고있는(표시는 안나도) 최상위클래스인 Object 의 메소드를 호출. 객체(변수)를 출력 시에 이 메소드의 리턴값이 출력!

    public Object remove(int index) {
        Object removed = elementData[index];
        for (int i = index + 1; i <= size - 1; i++) {
            elementData[i - 1] = elementData[i];
        }
        size--;
        elementData[size] = null;  //index = size = 5 인 공간은 여전히 40이 남아있으므로 얘를 지워주자
        return removed;
    } //arraylist 클래스는 순수한 배열을 통해 구현된다. 고로 덮어쓰고 하는 것이 발생하는 것이다.

    public Object removeFirst() {
        return remove(0);
    }

    public Object removeLast() {
        return remove(size - 1);
    }

    public Object get(int index) {
        return elementData[index];
    }

    public int size() {
        return size;
    }

    public int indexOf(Object element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elementData[i]))
                return i;
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new ListIterator();
    }


    class ListIterator {
        private int nextIndex = 0;

        public boolean hasNext() {
            return nextIndex < size();
        }

        public Object next() {
            return elementData[nextIndex++];  //index = 0서부터 리턴하고 다음인덱스로 넘어간다.
        }

        public boolean hasPrevious() {
            return nextIndex > 0;
        }

        public Object previous() {
            return elementData[--nextIndex];  //index = 마지막인덱스 + 1 서부터 이전인덱스로 넘어가고 리턴한다.
        }

        public void add(Object element) {  //30을 리턴하고 nextIndex = 3이지. 이때 if 조건 참이여서 add(35)가 실행.
            MyArrayList.this.add(nextIndex++, element);
            //메소드와 내부메소드의 이름이 같으면 오류여서 this 붙이고, 원래 add()는 외부클래스꺼니까 외부클래스명 붙이고!
        }

        public void remove() {
            MyArrayList.this.remove(nextIndex - 1);  //30을 삭제하고싶으니 nextIndex - 1 = 2해서 이 친구가 덮혀.
            nextIndex--;  
            //nextIndex 자체가 항상 한 칸 다음을 가리키기 때문에 1을 빼서 현재의 상태로 되돌리는 것이다. 기존 20자리 차지한 30을 출력위해
        }
    }
}
