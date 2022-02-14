package Facade;

public class Movie {

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public void search() {
        System.out.println(name + "이라는 영화를 찾다");
    }

    public void charge() {
        System.out.println("영화를 결제하다");
    }

    public void play() {
        System.out.println("영화 재생");
    }
}
