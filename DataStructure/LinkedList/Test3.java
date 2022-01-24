package LinkedList;

public class Test3 {
    public static void main(String[] args) {

        MyLinkedList numbers = new MyLinkedList();

        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);

        MyLinkedList.ListIterator i = numbers.listIterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
