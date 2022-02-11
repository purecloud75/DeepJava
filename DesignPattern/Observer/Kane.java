package Observer;

public class Kane implements Crew {
    @Override
    public void update(String msg) {
        System.out.println("해리케인 수신 : " + msg);
    }
}
