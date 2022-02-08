package Lambda;

@FunctionalInterface
public interface Add {
    //함수형 인터페이스. 람다식을 사용하기 위한 인터페이스이다.
    //단 하나의 추상메소드만을 선언한 인터페이스이다. 그래야 람다식의 왼쪽의 ()는 저 add 옆에 (int x, int y)를 의미하는 것이고
    //화살표기준 오른쪽의 {}는 혹은 생략된형태는 구현클래스 내에 이 추상메소드를 재정의한 부분의 중괄호 실행문을 의미할 수 있게 된다.

    public int add(int x, int y);
}
