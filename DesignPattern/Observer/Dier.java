package Observer;

public class Dier implements Crew {
    @Override
    public void update(String msg) {
        System.out.println("에릭다이어 수신 : " + msg);
    }
}
