package InnerClass;

class Outer2 {
    //기본은 메소드안에 클래스를 선언할 수 있다는데에서 온다. 익명클래스는 지역내부클래스의 파생이다.

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {
        //이 메소드가 호출될 때에는 외부클래스가 생성된 다음일테니까 외부변수는 노상관. 매개변수는 메소드가 호출될 때 생성된다.
        //메소드의 매개변수와 지역변수는 스택메모리에 저장되기에 이 메소드가 다끝나면 없어진다. 스택에 잡히지않기 위해 final 을 붙인다.
        //이 메소드가 끝나서 변수가 없어진후에 지역내부클래스의 run()이 호출되면 이때 사라지고난 변수엔 접근이 안되니깐 상수화를 시킨다고.
        //지역내부클래스의 객체는 메소드 실행이 끝나도 힙 메모리에 존재해서 계속해서 사용할수있기에 변수들을 따로 복사해 놓아야한다. 변경불가
        int num = 10;

        //class MyRunnable implements Runnable { //Runnable 인터페이스의 구현클래스이다.
        return new Runnable() {  //인터페이스의 구현클래스를 중괄호에 적고 구현객체를 생성하고 이를 반환하고있다.
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
        //이게지금 원래클래스의 상위클래스 혹은 구현하고자했던 인터페이스타입을 클래스이름대신 적고, new 를 통해 하위 / 구현클래스의 객체를
        //생성한 다음 중괄호 열고 그 안에 원래클래스의 구현(정의)부분을 적는다. 클래스의 정의와 객체 생성을 한번에 한다!
        //인터페이스명 변수명 = new 인터페이스명 꼴이다.
        @Override  //인터페이스에 선언된 추상메소드들을 빠짐없이 다 실체메소드로써 재정의해주어야 오류가 안 난다.
        public void run() {
            System.out.println("러너블 클래스");
        }
    };
}


public class AnonymousTest {
    public static void main(String[] args) {

        Outer2 out = new Outer2();
        Runnable runner = out.getRunnable(100);  //중괄호 안의 방식으로 구현된 객체를 반환하고있다.

        runner.run();

        out.runnable.run();
    }
}

/*
클래스의 이름을 생략하고 주로 하나의 인터페이스나 하나의 추상클래스를 구현하여 반환한다. 주로 일회성 내부클래스의 경우 익명을 이용한다.
인터페이스나 추상클래스 자료형의 참조타입변수에 직접 대입하여 클래스를 생성하거나(객체생성) 지역내부클래스의 메소드 내부에서 생성하여 반환한다.

충접클래스에서 바깥클래스 참조얻기.  바깥클래스.this.멤버  형태로 해야 중첩클래스의 멤버가아닌 바깥의 멤버에 접근이 가능하다.
 */