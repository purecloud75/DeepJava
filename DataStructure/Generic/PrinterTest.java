package Generic;

public class PrinterTest {
    public static void main(String[] args) {

        /*Powder powder = new Powder();
        ThreeDPrinter3 printer = new ThreeDPrinter3();

        printer.setMaterial(powder);

        Powder p = (Powder) printer.getMaterial();
        //Object 도 가능하지만 재료를 가져올 때마다 강제타입변환을 하는게 불편하다*/


        Powder powder = new Powder();
        Plastic plastic = new Plastic();

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        //실제로 쓸 타입을 여기서 적어준다. T extends A 를 썼다면, A 클래스를 상속받지 않은 모든 클래스는 <>안에 올 수 조차 없다.

        powderPrinter.setMaterial(powder);
        plasticPrinter.setMaterial(plastic);

        Powder po = powderPrinter.getMaterial();
        Plastic pl = plasticPrinter.getMaterial();
        //나중에 컴파일러가 실행할 때, 쓰이는 해당클래스의 모든 T에 <>안의 타입이 대입되서 형변환 없이도 편리하게 가능.

        System.out.println(po);
        System.out.println(powderPrinter);
        System.out.println(pl);
        System.out.println(plasticPrinter);
        //객체를 참조하는 변수를 바로 출력 할 시, 객체의 해당타입의클래스에 재정의되어있는 toString()이 변수옆에 자동으로 붙어서 실행된다.
    }
}

/*
이 변수에 다양한 자료형을 쓸 수있다. 그러면 이 변수를 기반으로 클래스를 만든다고 했을때, 다양한 자료형이쓰이기때문에 클래스를 여러개를 만들면
오버헤드란 말이죠. 추후 해당클래스를 사용할 때 지정할 수 있도록 선언한다. 컬렉션 프레임워크에서 많이 사용되고 있음.
 */