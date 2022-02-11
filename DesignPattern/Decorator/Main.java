package Decorator;

public class Main {
    public static void main(String[] args) {

        ICar audi = new Audi(1000);
        audi.showPrice();

        //인터페이스타입 참조변수에는 구현클래스의 자식객체도 할당가능했었지
        ICar audi3 = new A3(audi, "A3");
        //자식객체를 통해 부모타입에 접근이 가능했었지
        audi3.showPrice();

        ICar audi4 = new A4(audi, "A4");
        audi4.showPrice();

        ICar audi5 = new A5(audi, "A5");
        audi5.showPrice();
    }
}
/*
데코레이터는 기존 뼈대(클래스)는 유지하되, 이후 필요한 형태로 꾸밀 때 사용한다. 확장이 필요한 경우 상속의 대안으로도 활용한다.
케이크가 있는데, 초코를 바르면 초코케이크가 되는거고 딸기를 올리면 딸기케이크가 되는 식이다.
 */