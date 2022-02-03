package InnerClass;

class Outer2 {
    //기본은 메소드안에 클래스를 선언할 수 있다는데에서 온다. 익명클래스는 지역내부클래스의 파생이다.

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {
        //이 메소드가 호출될 때에는 외부클래스가 생성된 다음일테니까 외부변수는 노상관. 매개변수는 메소드가 호출될 때 생성된다.
        //메소드의 매개변수와 지역변수는 스택메모리에 저장되기에 이 메소드가 다끝나면 없어진다. 스택에 잡히지않기 위해 final 을 붙인다.
        //이 메소드가 끝나서 변수가 없어진후에 지역내부클래스의 run()이 호출되면 이때 사라지고난 변수엔 접근이 안되니깐 상수화를 시킨다고.
        int num = 10;

        //class MyRunnable implements Runnable { //Runnable 인터페이스의 구현클래스이다.
        return new Runnable() {
            //원래 클래스가 extends 혹은 implements 하는 친구의 이름으로 대체하는데 없다면 Object()로 한다.
            //끝에 괄호()붙는거는 Class a = new Class()에서 이 괄호랑 같은 의미이다. 클래스 정의와 생성을 하나로 합친거다 한마디로!
            int localNum = 1000;
            @Override
            public void run() {
                //num = 20; 처럼 값을 못바꾼다. final 이 자동으로 컴파일러가 붙여주기 때문이다. 붙여도되고 안써도 되고 자동으로 붙음
                System.out.println(i);
                System.out.println(num);
                System.out.println(localNum);

                System.out.println(outNum + "외부클래스의 인스턴스변수");
                System.out.println(Outer2.sNum + "외부클래스의 정적변수");
            }
        };
        //return new MyRunnable();
        //클래스이름이 메소드내부에서도 2군데 빼고는 쓰일일이 없으니까 이름을 생략한다. 이게 익명내부클래스
    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("러너블 클래스");
        }
    };
}


public class AnonymousTest {
    public static void main(String[] args) {

        Outer2 out = new Outer2();
        Runnable runner = out.getRunnable(100);

        runner.run();

        out.runnable.run();
    }
}

/*
클래스의 이름을 생략하고 주로 하나의 인터페이스나 하나의 추상클래스를 구현하여 반환한다.
인터페이스나 추상클래스 자료형의 참조타입변수에 직접 대입하여 클래스를 생성하거나(객체생성) 지역내부클래스의 메소드 내부에서 생성하여 반환한다.
 */