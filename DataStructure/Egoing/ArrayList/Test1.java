package Egoing.ArrayList;

public class Test1 {
    public static void main(String[] args) {

        MyArrayList numbers = new MyArrayList();

        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);
        //하나씩 뒤에 추가하는 모습

        numbers.add(1, 15);
        //1번인덱스 방에다가 15라는 값을 넣는 모습

        numbers.addFirst(5);
        //배열의 첫번째 위치에 추가하는 모습

        System.out.println(numbers.remove(1));
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println(numbers.get(2));
        System.out.println(numbers.indexOf(15));
        System.out.println(numbers.size());

        System.out.println(numbers);
        //객체를 곧장 출력해도, 문자열타입으로써 출력해주는 toString()메소드에 의해 사용자가 보기편하게 객체의 정보를 보여준다.
    }
}
