package Object.ch5;

public class MemberExam {
    public static void main(String[] args) {

        Member original = new Member("stone", 25, new int[]{10, 20, 30}, new Car("sonata"));

        Member clone = original.getMember();

        System.out.println("원본객체의 이름: " + original.name);
        System.out.println("원본객체의 나이: " + original.age);
        System.out.println("원본객체의 배열: " + original.scores[0]);
        System.out.println("원본객체의 차: " + original.car.model);

        clone.name = "water";
        clone.age = 15;
        clone.scores[0] = 100;
        clone.car.model = "Genesis";


        System.out.println("복제객체의 이름: " + clone.name);
        System.out.println("복제객체의 나이: " + clone.age);
        System.out.println("복제객체의 배열: " + clone.scores[0]);
        System.out.println("복제객체의 차: " + clone.car.model);

    }
}
//깊은복사의 예시이다. 얕은복사는 Object 의 clone()을 재정의하지 않고 쓰면 된다. 그럴땐 복제객체에서 참조타입필드를 변경하면 원본도 훼손된다