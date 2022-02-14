package Facade;

public class Main {
    public static void main(String[] args) {

        Beverage beverage = new Beverage("사이다");
        RemoteControl remoteControl = new RemoteControl();
        Movie movie = new Movie("스파이더맨:노웨이 홈");

        beverage.prepare();
        remoteControl.turnOn();
        movie.search();
        movie.charge();
        movie.play();


        //위의 코드를 단 2줄로 줄여도 똑같은 결과가 나온다.
        Facade facade = new Facade("사이다","스파이더맨:노웨이 홈");
        facade.viewMovie();
    }
}

/*
Facade 는 "건물의 정면"이란 뜻으로, 복잡한 소프트웨어를 사용할 수 있게 간단한 인터페이스를 제공한다.
사용자입장에서는 이제 서브클래스들(영화,리모컨,음료 클래스)의 내부에 뭐가있는지 알 필요가 없다.
단지 facade 객체의 viewMovie()를 호출하면서 서브클래스들의 복잡한 기능을 수행할 수 있기 때문이다.
 */