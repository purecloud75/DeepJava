package Egoing.ArrayList;

public class Test2 {
    public static void main(String[] args) {

        MyArrayList numbers = new MyArrayList();

        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);

        MyArrayList.ListIterator li = numbers.listIterator();
        //저 메소드를 호출하면 어떤 객체를 리턴한다. ListIterator 라는 내부클래스(중첩클래스)타입의 참조변수에 리턴객체를 할당한다.
        //배열에서의 반복을 담당한다. 디자인패턴의 한 종류로써 이것이 권장된다 더 어렵기는 하지만.
        while (li.hasNext()) {  //hasNext()가 false 를 반환하기 직전까지 계속 반복.
            System.out.println(li.next());  //첫번째 엘리먼트부터 하나씩을 리턴한다.
        }
        while (li.hasPrevious()) {
            System.out.println(li.previous());  //마지막 값이 들어있는 인덱스의 바로 전 인덱스의 값부터 하나씩을 리턴한다.
        }

        /*
        while (li.hasNext()) {
            int num = (int) li.next();
            if (num == 20) {
                li.add(25);
            }
        }
        System.out.println(numbers);
        */

        while (li.hasNext()) {
            int num = (int) li.next();
            if (num == 20) {
                li.remove();
            }
        }
        System.out.println(numbers);
    }
}
