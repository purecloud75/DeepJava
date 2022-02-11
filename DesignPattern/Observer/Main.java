package Observer;

public class Main {
    public static void main(String[] args) {

        Conte conte = new Conte();
        Crew sonny = new Sonny();
        Crew dier = new Dier();
        Crew kane = new Kane();

        conte.subscribe(sonny);
        conte.subscribe(dier);
        conte.subscribe(kane);

        conte.runaway();

        conte.unsubscribe(sonny);

        conte.eatFood();
    }
}

/*
어떤 객체의 상태가 변할 때(코치의 구독취소) 그와 연관된 객체들에게 알림을 보낸다.
크루들은 코치가 하는 일들을 모두 notify(알림)받아야 한다.
 */