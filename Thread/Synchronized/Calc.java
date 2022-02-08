package Synchronized;

public class Calc {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory(int memory) {
        //synchronized (this) {} 소괄호안에는 공유객체가 들어가고(여기선 본인) 중괄호안에 한번에 한 스레드만 이용할 코드를 넣는다.
        this.memory = memory;
        try {
            Thread.sleep(2000); //스레드의 실행흐름을 2초간 일시정지. 그동안 user2가 모든 작업을 끝마치기에 충분한 시간이다.
        } catch (InterruptedException e) {
        }
        System.out.println(Thread.currentThread().getName() + ":" + this.memory);
    }
}

/*
멀티스레드가 공유객체를 갖는 경우, 어느 한 스레드가 공유객체를 쓰고있다가 잠시 쉬는데 다른 스레드가 얘를 써서 저장된 값을 변경시키거나하면
원래 쓰고있던 스레드에서의 실행결과가 의도와 달라질 수있는 우려가 있다. 그래서 한 스레드가 공유객체를 쓰면서 실행하는 동안은
다른 스레드가 이 객체에 공유하지 못하게 잠금을 건다. synchronized(동기화) 키워드를 메소드나 블록을 이용해서 맣이다.
스레드가 실행을 다 끝마치면 그제야 잠금이 풀리면서 다른 작업스레드가 공유객체에 접근 가능하다.
 */