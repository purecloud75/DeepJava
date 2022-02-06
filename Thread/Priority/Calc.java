package Priority;

public class Calc extends Thread {

    public Calc(String name) {
        setName(name);
    }

    public void run() {
        for (int i = 0; i < 2000000000; i++) {
        }
        System.out.println(getName());
    }
}
