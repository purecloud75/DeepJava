package Strategy;

public class MainClient {
    public static void main(String[] args) {

        Moving ship = new Ship();
        Moving car = new Car();

        ship.setMovableStrategy(new BySea());
        car.setMovableStrategy(new ByLand());

        ship.move();
        car.move();

        car.setMovableStrategy(new BySea());
        car.move();
    }
}

/*
객체들이 할 수 있는 행위 각각에 대해 전략 클래스를 생성하고, 유사한 행위들을 캡슐화하는 인터페이스를 정의하여,
객체의 행위를 동적으로 바꾸고싶을 경우, 직접 행위를 수정하지 않고 전략을 바꿔주기만 함으로써 행위를 유연하게 확장하는 방법을 말한다.
 */
