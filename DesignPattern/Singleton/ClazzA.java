package Singleton;

public class ClazzA {

    private SocketClient socketClient;

    public ClazzA() {
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
