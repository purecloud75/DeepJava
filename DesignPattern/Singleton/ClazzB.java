package Singleton;

public class ClazzB {

    private SocketClient socketClient;

    public ClazzB() {
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
