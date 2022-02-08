package Daemon;

public class Exam {
    public static void main(String[] args) {
        
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();
        
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        System.out.println("메인 스레드 종료");
    }
}
/*
데몬스레드는 주 스레드의 작업을 보조적으로 돕는 스레드이다. 주 스레드가 종료되면 데몬 스레드는 강제적으로 종료된다.
원래는 각자의 메인이던 작업들이던 서로 독립적으로 실행되고 각자가 끝나도 서로에게 영향을 주지않는 기존과는 다르다.
여기서는 메인스레드가 주 스레드가 되고, AutoSaveThread 가 데몬 스레드가 된다
 */