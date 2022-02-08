package Synchronized;

public class User2 extends Thread{

    private Calc calculator;

    public void setCalculator(Calc calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory(50);
    }

}
