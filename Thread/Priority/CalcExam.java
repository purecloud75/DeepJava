package Priority;

public class CalcExam {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            Thread thread = new Calc("thread" + i);

            if (i != 10) {
                thread.setPriority(Thread.MIN_PRIORITY);  // 1. 따로 설정안해주면 기본값인 5로 배정.
            } else {
                thread.setPriority(Thread.MAX_PRIORITY);  // 10. 가장높다고 무조건 제일먼저끝남 ㄴㄴ. 1빠일 확률이 높아지는것 뿐
            }
            thread.start();
        }
    }
}

/*
멀티스레드는 동시성 혹은 병렬성으로 실행된다.
동시성은 멀티태스킹을 위해 싱글코어(하나의 CPU)에서 멀티스레드가 번갈아가며 실행하는 성질이다.
병렬성은 멀티태스킹을 위해 멀티코어에서 개별 스레드를 동시에 실행하는 성질이다. 코어하나당 하나의 스레드를 맡는다. 1대1 전담마크느낌.

스레드의 개수가 코어의 수보다 많을 경우, 스레드를 어떤 순서에 의해 동시성으로 실행할 것인가르 결정해야 하는데, 이것을 스레드 스케줄링이라 한다.
스레드 스케줄링에 의해 스레드들은 아주 짧은 시간에 번갈아가면서 그들의 run() 메소드를 조금씩 실행한다.
우선순위방식(각 작업스레드 객체마다 우선순위 1~10까지 부여함. 10이 제일 높음)과 순환할당방식(정해진 시간만큼 실행 후 넘긴다)이 있다.
 */
