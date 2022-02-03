package Lambda;

public class AddTest {
    public static void main(String[] args) {

        Add func = (x, y) -> {return x + y;};  //인터페이스에 있는 add 함수를 구현한 것이다. 람다식을 변수에 대입한다.
        Add func2 = (x, y) -> x + y;

        MyNumber num = (a, b) -> (a > b) ? a : b;

        String s1 = "what";
        String s2 = "about";
        StringConcat str = (c, d) -> System.out.println(c + " " + d);
        //원래는 해당인터페이스타입을 구현한 클래스들 중 하나의 객체를 생성해서 할당해야하지만, 람다식은 구현클래스 없어도 메소드 정의만 해줌
        StringConcat str2 = new StringConcat() {
            @Override
            public void SumString(String str1, String str2) {
                System.out.println(str1 + ", " + str2);
            }
        };

        System.out.println(func.add(2, 3));
        System.out.println(num.getMax(6, 7));
        str.SumString(s1, s2);
        str2.SumString(s1, s2);
    }
}
/*
(매개변수) -> {실행문;} 형태로, 익명함수(이름이 없는 함수)이다. 매개변수가 하나거나 실행문이 한문장이면 자료형하고 괄호생략 가능.
그리고 실행문 한문장이어도 return 문이면 return 하고 괄호를 둘 다 생략가능

원래는 인터페이스를 선언을 했으면 인터페이스 기반의 구현클래스를 만들었고 그 클래스를 생성하고(new 로 객체생성) 그 객체를 이용해서
그 클래스의 메소드를 호출하는 건데, 지금은 인터페이스만 선언하고 실행클래스에서 바로 구현을 합니다. 메소드에 대해서 말이죠, 람다식을 이용해서.

람다식을 이용하면 구현클래스없이도 인터페이스의 메소드를 바로 쓸 수가 있는데, 사실은 익명내부클래스가 작동하고 있는거여서 엄밀히는 클래스를 쓴다
람다식을 변수에 할당하고 매개변수에도 전달하고 반환값으로도 쓴다. 마치 변수처럼
 */
