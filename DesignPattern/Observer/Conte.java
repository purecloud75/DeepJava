package Observer;

import java.util.ArrayList;
import java.util.List;

public class Conte implements Coach {

    private List<Crew> crews = new ArrayList<>();

    public void eatFood() {
        System.out.println("콘테감독이 인터뷰를 한다.");
        notifyCrew("인터뷰중이야 잘 말해줄게");
    }

    public void runaway() {
        System.out.println("콘테감독이 놀고있다.");
        notifyCrew("같이 놀 사람!");
    }

    @Override
    public void subscribe(Crew crew) {
        crews.add(crew);
    }

    @Override
    public void unsubscribe(Crew crew) {
        crews.remove(crew);
    }

    @Override
    public void notifyCrew(String msg) {
        for (Crew crew : crews) {
            crew.update(msg);
        }
    }
}
