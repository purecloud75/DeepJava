package ArrayList;

public class Test {
    public static void main(String[] args) {

        MyArray array = new MyArray(10);

        array.addElement(10);
        array.addElement(20);
        array.addElement(30);
        array.insertElement(1,15);
        array.printAll();

        System.out.println("");
        array.removeElement(2);
        array.printAll();
    }
}
