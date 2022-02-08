package Synchronized;

public class MainThreadExam {
    public static void main(String[] args) {

        Calc calculator = new Calc();

        User1 user1 = new User1();  //Thread 클래스타입변수에 자식객체를 할당해도되고, Thread 의 자식클래스타입변수에 할당해도 된다
        user1.setCalculator(calculator);
        user1.start();

        //메인스레드가 첫번째 작업스레드를 실행하고나서 내려오면서 2번째 작업스레드객체를 생성하는 모습. 총 3개의 멀티스레드임. 메인1 + 작업2
        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start();  //첫번째 작업스레드가 2초간 정지하는 동안 두번째스레드가 실행되면서 memory 가 50으로 바뀐다.
    }
}
