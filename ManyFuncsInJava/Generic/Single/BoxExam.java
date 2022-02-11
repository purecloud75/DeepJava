package Generic.Single;

public class BoxExam {
    public static void main(String[] args) {

        Box<String> box1 = new Box<>();
        //해당 클래스(Box)타입의 객체내에서 T 타입으로 선언된 멤버들에 한해서 모두 String 타입으로 바뀐다는 의미다.
        box1.set("VIVIZ");
        String str = box1.get();

        Box<Integer> box2 = new Box<>();
        box2.set(3);
        int value = box2.get();

        System.out.println(str + value);
    }
}

/*
Object 타입을 사용하면 모든 종류의 자바 객체를 저장할 수 있다는 장점은 있지만, 저장할 때 자동타입변환, 읽어올 때 강제타입변환을 해야해서
프로그램 성능 저하의 우려가 있다. 모든 종류의 객체를 저장하면서 타입변환이 발생하지 않도록 하는 방법이 바로 제네릭이다!

제네릭은 클래스를 설계할 때 구체적인 타입은 명시하지 않고, 타입 파라미터(T)로 대체했다가 실제 클래스가 사용될 때(객체 생성할 때)
구체적인 타입을 지정함으로써 타입변환을 최소화 한다.
 */