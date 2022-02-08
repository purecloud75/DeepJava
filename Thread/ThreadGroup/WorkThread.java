package ThreadGroup;

public class WorkThread extends Thread {

    public WorkThread(ThreadGroup tg, String threadName) {
        super(tg, threadName);
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
                break;
            }  //속한 스레드그룹에서 interrupt()호출 시, 거기에 속한 모든 스레드들의 interrupt()가 호출되어 예외발생. 반복문 탈출.
        }
        System.out.println(getName() + " 종료됨");
    }
}
/*
JVM 이 실행되면 system 스레드그룹을 만들고, JVM 운영에 필요한 스레드들을 생성해서 system 스레드그룹에 포함시킨다.
그 system 그룹의 하위 스레드그룹으로 main 을 만들고, 메인 스레드를 main 스레드그룹에 포함시킨다. 스레드는 반드시 하나의 스레드그룹에
포함되는데, 명시적으로 포함시키지않으면 디폴트로 자신을 생성한 스레드가 속한 스레드그룹에 속하게 된다.
현재 예제로 생성하는 작업스레드는 대부분 메인 스레드가 생성하므로, 메인스레드가 포함된 main 스레드그룹에 속하게 된다.


 */