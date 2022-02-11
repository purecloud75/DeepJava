package Singleton;

public class Main {
    public static void main(String[] args) {

        ClazzA clazzA = new ClazzA();
        ClazzB clazzB = new ClazzB();

        SocketClient aClient = clazzA.getSocketClient();
        SocketClient bClient = clazzB.getSocketClient();

        System.out.println(aClient.equals(bClient));  
        //true. 둘은 동일한 객체를 참조하고있다. getInstance()가 아닌, 생성자를 public 으로 변경해서 평소처럼 new 로 생성했디면
        //여기 두 참조변수에는 독립된 각각의 객체가 들어있을것이고 false 가 나왔을 것이다.
    }
}
//싱글톤은 어떤 프로그램에서 한 개의 객체만 존재해야할 때 쓴다. 여러 컴퓨터가 한 대의 프린터기를 공유하는 느낌