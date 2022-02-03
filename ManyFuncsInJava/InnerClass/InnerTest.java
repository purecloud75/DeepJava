package InnerClass;

class OutClass {

    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
        //외부클래스의 생성자호출과 동시에 내부클래스의 객체가 생성된다.
    }

    private class InClass {
        //내부클래스는 보통 프라이빗으로 선언. 당연한게 외부클래스만 쓸 클래스니깐. 내부에 스태틱 못옴.

        int iNum = 100;

        void inTest() {
            System.out.println(num + "외부클래스의 인스턴스 변수");
            System.out.println(sNum + "외부클래스의 정적 변수");
            System.out.println(iNum + "내부클래스의 인스턴스 변수");
        }
    }

    static class InStaticClass {

        int iNum = 100;
        static int sInNum = 200;

        void inTest() {
            //System.out.println(num +"외부클래스의 인스턴스 변수");
            //내부클래스의 생성과 상관없이 num 이 만들어질 수 있기 때문에. num 이 생성되지 않은 순간에 이 메소드가 호출될 수 있다는 거죠
            //정적클래스가 외부클래스와 상관없이 만들어질 수 있으니까. 그래서 얘는 문법상 오류.
            System.out.println(iNum + "내부클래스의 인스턴스 변수");
            System.out.println(sNum + "외부클래스의 정적 변수");
            System.out.println(sInNum + "내부클래스의 정적 변수");
        }

        static void sTest() {
            //System.out.println(num +"외부클래스의 인스턴스 변수");
            //System.out.println(iNum + "내부클래스의 인스턴스 변수");
            //정적내부클래스가 생성되기도 전에 이 메소드가 호출될 수 있기때문에, 내부의 인스턴스를 쓸 수 없다. 외부의 인스턴스변수도 못쓰고.
            System.out.println(sNum + "외부클래스의 정적 변수");
            System.out.println(sInNum + "내부클래스의 정적 변수");
        }
    }

    public void usingClass() {
        inClass.inTest();
    }
}




public class InnerTest {
    public static void main(String[] args) {

        OutClass outClass = new OutClass();
        outClass.usingClass();

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();
        //외부클래스 객체를 생성 안하고도 정적내부클래스타입의 객체를 바로 만들 수 있다

        OutClass.InStaticClass.sTest();
        //정적내부클래스의 정적메소드의 경우는 한번에 접근 가능하다
    }
}

/*
내부클래스를 왜 쓰나? 내부클래스에서 외부클래스의 멤버들을 쉽게 접근할 수 있음.
독립된 두 클래스간에 서로의 멤버에 접근하려면 한 클래스내에서 다른 한 클래스의 객체를 선언한 이후에야 접근이 가능한것에 비해 객체생성 필요없음!
외부 : 이 곰인형(내부) 내꺼야! 너희들(외부와 같은 레벫에 있는 독립된 다른 클래스들) 건들지마

내부클래스는 클래스의 멤버처럼 4가지의 접근제어자 다 붙을수있다. 원래는 (default)와 public 요 2개만 붙을 수 있다.
정적클래스만 정적멤버를 정의할 수 있다. 정적멤버는 객체생성없이 사용가능한것인데, 일반클래스이면 객체를 생성한 이후에나 접근가능하기에 모순발생
 */