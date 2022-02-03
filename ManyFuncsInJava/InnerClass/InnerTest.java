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
