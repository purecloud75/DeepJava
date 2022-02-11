package Adapter;

public class Cleaner implements Electronic220V {

    @Override
    public void powerOnn() {
        System.out.println("청소기 220v on");
    }
}
