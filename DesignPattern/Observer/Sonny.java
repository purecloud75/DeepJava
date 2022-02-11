package Observer;

public class Sonny implements Crew {
    @Override
    public void update(String msg) {
        System.out.println("손흥민 수신 : " + msg);
    }
}
