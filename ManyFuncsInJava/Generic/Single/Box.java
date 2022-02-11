package Generic.Single;

public class Box<T> {

    private T any;

    public void set(T any) {
        this.any = any;
    }

    public T get() {
        return this.any;
    }
}
