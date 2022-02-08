package Synchronized;

public class User1 extends Thread{  //작업스레드 객체의 설계도(클래스)
    
    private Calc calculator;
    
    public void setCalculator(Calc calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {  //메인스레드에서 작업스레드객체.start()메소드를 호출하면 이 실행코드를 담고있는 run()메소드가 실행된다.
        calculator.setMemory(100);
    }
    
}
