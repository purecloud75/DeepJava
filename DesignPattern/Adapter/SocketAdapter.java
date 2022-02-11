package Adapter;

//220이 들어와서 110으로 나갈거기 때문에 기본으로 110을 상속받는다.
public class SocketAdapter implements Electronic110V {

    private Electronic220V electronic220V;

    public SocketAdapter(Electronic220V electronic220V) {
        this.electronic220V = electronic220V;
    }

    @Override
    public void powerOn() {
        electronic220V.powerOnn();
    }
}
