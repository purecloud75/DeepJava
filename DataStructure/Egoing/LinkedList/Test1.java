package Egoing.LinkedList;

public class Test1 {
    public static void main(String[] args) {

        MyLinkedList numbers = new MyLinkedList();

        numbers.addFirst(40);
        numbers.addFirst(30);
        numbers.addFirst(20);
        numbers.addFirst(10);  //결국 10 -> 20 -> 30 -> 40 으로 생성될 것이다.

        numbers.add(3, 35);  //3번인덱스에 값 35를 넣겠다. 즉 덮어쓰지않고 다음객체를 뒤로 미루면서 순서를 유지하겠다

        System.out.println(numbers.remove(2));
        System.out.println(numbers.removeLast());

        System.out.println(numbers.get(1));
        System.out.println(numbers.indexOf(20));

        System.out.println(numbers);

    }
}
