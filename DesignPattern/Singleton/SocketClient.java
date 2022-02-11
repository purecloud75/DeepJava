package Singleton;

public class SocketClient {

    private static SocketClient socketClient = null;
    //외부에서 필드에 바로 접근하는것을 막는다. 정적으로 선언해서 해당클래스의 객체를 만들지 않고도 바로 getInstance()호출 가능.

    private SocketClient() {}
    //외부에서 new 를 통한 생성자호출을 막는다. 해당 클래스의 객체를 얻기위한 유일한 방법은 getInstance()를 호출하는 것 뿐이다.

    public static SocketClient getInstance() {
        if (socketClient == null) {
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect() {
        System.out.println("connect");
    }
}
