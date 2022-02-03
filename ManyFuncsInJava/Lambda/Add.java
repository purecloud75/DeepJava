package Lambda;

@FunctionalInterface
public interface Add {
    //함수형 인터페이스. 람다식을 사용하기 위한 인터페이스를 의미한다.
    //익명 함수와 매개변수만으로 구현되므로 인터페이스는 단 하나의 메소드만을 선언해야 함.

    public int add(int x, int y);
}
