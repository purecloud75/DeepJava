package Object.ch4;

public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return name;
    } //실행클래스에서 System.out.println(person);처럼 객체변수를 곧장 출력할적에 toString()이 자동으로 붙어서 호출됨. Jung 출력!
}
