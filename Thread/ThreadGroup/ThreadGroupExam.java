package ThreadGroup;

public class ThreadGroupExam {
    public static void main(String[] args) {

        ThreadGroup myGroup = new ThreadGroup("myGroup");
        //ThreadGroup myGroup = new ThreadGroup(ThreadGroup parent, String name);
        //스레드그룹 생성시 부모스레드그룹(parent)을 지정하지 않으면, 현재 스레드가 속한 그룹의 하위그룹으로 생성된다. 생성자가 두 종류.
        //그래서 myGroup 스레드그룹은 main 스레드그룹의 하위그룹이다. 현재 실행하고있는 스레드가 메인 스레드이기 때문

        WorkThread threadA = new WorkThread(myGroup, "threadA");  //포함되고싶은 스레드그룹, 속해지는 스레드의 이름
        WorkThread threadB = new WorkThread(myGroup, "threadB");
        //새로운 스레드그룹을 생성한 후, 만든 그룹에 스레드를 포함시키려면, 작업스레드객체를 생성할 때, 생성자 매개값으로 스레드그룹을 지정함
        //결국 main 스레드그룹의 메인스레드와, main 의 하위그룹인 myGroup 스레드그룹의 2개의 작업스레드로, 총 3개의 멀티스레드로 구성됨
        threadA.start();
        threadB.start();

        System.out.println("main 스레드그룹의 정보출력 결과");
        ThreadGroup tg = Thread.currentThread().getThreadGroup();
        tg.list();  //현재 실행중인 스레드인 메인스레드가 속한 main 스레드그룹의 리스트를 출력한다.
        System.out.println();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        System.out.println("myGroup 스레드그룹의 interrupt() 메소드 호출");
        myGroup.interrupt();
    }
}
/*
스레드를 스레드그룹에 포함시키는 이유 중 하나는, 스레드그룹에서 제공되는 메소드를 한번만 호출해도 그 그룹에 속한 모든 메소드들이 호출된다.
스레드그룹의 interrupt()은 이 그룹에 속한 두 작업스레드의 interrupt()를 한번에 호출하는 효과인 것이다. 예외발생시켜서 스레드 종료시킨다.

여기선 대표적으로 interrupt()을 썼지만 훨씬 더 많은 메소드들이 있으니 필요할 때 그때그때 공부하는게 더 나아보인다.
 */