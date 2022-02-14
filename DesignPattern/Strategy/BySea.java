package Strategy;

public class BySea implements MovableStrategy {

    @Override
    public void move() {
        System.out.println("바닷길을 통해 이동");
    }
}
