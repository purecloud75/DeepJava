package Lambda;

public class AddTest {
    public static void main(String[] args) {

        Add func0 = new Add() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };
        Add func1 = (int x, int y) -> {return x + y;};
        Add func2 = (x, y) -> x + y;
        //위의 3개는 100% 같은의미이며 내려올수록 간략화됨.
        //(x, y)는 함수형인터페이스의 유일한 메소드의 시그니처를 의미하고, {return x + y}는 유일한 메소드의 실행문을 의미한다.
        System.out.println(func0.add(2, 3));
        System.out.println(func1.add(2, 3));
        System.out.println(func2.add(2, 3));


        MyNumber num = (a, b) -> (a > b) ? a : b;
        //매개변수의 자료형 생략가능. 실행문이 1줄이라 중괄호생략가능. 그 1줄이 return 문이라 return 키워드 생략가능.
        System.out.println(num.getMax(6, 7));


        String s1 = "what";
        String s2 = "about";

        StringConcat str1 = new StringConcat() {
            @Override
            public void SumString(String str1, String str2) {
                System.out.println(str1 + ", " + str2);
            }
        };
        StringConcat str2 = (c, d) -> System.out.println(c + " " + d);
        str1.SumString(s1, s2);
        str2.SumString(s1, s2);
    }
}
/*
(매개변수) -> {실행문;} 형태로, 익명함수(이름이 없는 함수)이다. 매개변수가 하나거나 실행문이 한문장이면 소, 중괄호생략 가능.
그리고 실행문 한문장이면서 return 문이면 return 하고 괄호를 둘 다 생략가능.
런타임 시에 인터페이스에 정의해놓은 매개변수의 타입이 이미 적혀있어서 자동으로 인식함. 그래서 람다식에서 매개변수의 타입도 생략 가능.

원래는 인터페이스를 선언을 했으면 인터페이스 기반의 구현클래스를 만들었고 그 클래스를 생성하고(new 로 객체생성) 그 객체를 이용해서
그 클래스의 메소드를 호출하는 건데, 지금은 인터페이스만 선언하고 실행클래스에서 바로 구현을 합니다. 메소드에 대해서 말이죠. 
람다식을 이용해서 익명구현객체보다고 한 층 더 간편하게.
람다식은 함수적인터페이스의 하나뿐인 메소드를 구현한것이다. 익명구현객체의 간략화 버전이다.
 */
