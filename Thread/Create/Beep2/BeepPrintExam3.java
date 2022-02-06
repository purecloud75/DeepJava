package Create.Beep2;

import java.awt.*;

public class BeepPrintExam3 {
    public static void main(String[] args) {

        //이건 Thread 를 상속받는 자식클래스를 만듦과 동시에 자식객체를 부모타입에 할당한다. Thread 내의 run()을 재정의하면서 실행코드입력
        Thread thread = new Thread() { 
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                    }
                }
            }
        };

        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

