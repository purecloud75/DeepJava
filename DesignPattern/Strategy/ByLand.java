package Strategy;

public class ByLand implements MovableStrategy {

    @Override
    public void move() {
        System.out.println("땅을 통해 이동");
    }
}
