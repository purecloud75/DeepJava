package Name;

public class NameExam {
    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();
        //원래는 작업스레드 객체를 생성후에 Thread 클래스 내의 setName(), getName()메소드에 접근해야 하지만 얘는 정적메소드이고
        //코드를 실행하는 현재의 스레드의 참조를 얻을 수 있다.
        System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());

        Thread threadA = new ThreadA();
        System.out.println("작업 스레드이름: " + threadA.getName());
        threadA.start();

        Thread threadB = new ThreadB();
        System.out.println("작업 스레드이름: " + threadB.getName());
        threadB.start();
    }
}
//main  Thread-1  Thread-2 ... 메소드로 이름변경 및 이름가져오기 가능. 디버깅 시에 어떤 스레드가 어떤 작업을 하는지 조사할 목적으로 쓴다