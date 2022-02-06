package Create.Beep1;

import java.awt.*;

public class BeepPrintExam2 {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {  //Runnable 인터페이스의 익명구현객체가 생성자에 대입. 작업 스레드 객체생성
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
        });

        thread.start();  //여기서 비로소 작업스레드 객체가 실행된다.

        for (int i = 0; i < 5; i++) {  //동시에 메인스레드는 이 코드를 실행하므로 마침내 두 작업이 사실상 거의 동시에 실행된다.
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

/*
원래 의도대로 두 작업이 동시에 실행되는 예쁜 코드. 두 작업 중 하나를 메인스레드가 아닌 다른 스레드에서 실행시켜야 한다.

Runnable 인터페이스에는 단 하나의 메소드인 run()이 있는데 이 친구를 구현하는 과정에서 run()을 재정의하면서 중괄호 안에 넣는 코드가 바로
작업스레드에서 실행할 코드이고, 구현객체를 익명이던 직접만들던 람다식이던 해서
Thread 클래스타입의 객체를 생성하는 과정에서 생성자의 매개값에 넣는경우에 비로소 작업스레드 객체가 생성된 것이다.
그리고나서 그 객체의(즉 Thread 클래스 내에 있는) start() 메소드를 호출하면 그 작업스레드객체가 마침내 실행되는 것이다.
 */