package Create.Beep1;

import java.awt.*;

public class BeepPrintExam1 {
    public static void main(String[] args) {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

/*
원래 의도는 "띵"이 출력되면서 동시에 beep 소리를 내는것이었는데, 이 코드의 결과는 소리가 5번먼저 난 후에야 "띵"이 출력된다.
소리발생과 출력은 서로 다른 작업이라서 멀티스레드가 필요한데 얘는 메인스레드 하나밖에 없기에 소리발생 후에 출력을 진행하였다.
즉 작업스레드를 하나 만들어서 병렬로 처리해서 동시에 두 작업을 수행하게끔 바꿔줘야 한다.
 */
