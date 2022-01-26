package Generic;

public class Rect<T, V> {

    T x;
    V y;

    Rect(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }
}
