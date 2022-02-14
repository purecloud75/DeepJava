package Strategy;

public class Moving {

    private MovableStrategy movableStrategy;

    public void setMovableStrategy(MovableStrategy movableStrategy) {
        this.movableStrategy = movableStrategy;
    }

    public void move() {
        movableStrategy.move();
    }
}
