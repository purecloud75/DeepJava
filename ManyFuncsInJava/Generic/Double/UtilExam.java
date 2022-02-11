package Generic.Double;

public class UtilExam {
    public static void main(String[] args) {

        Pair<Integer, String> p1 = new Pair<>(3, "bob");
        Pair<Integer, String> p2 = new Pair<>(3, "bob");

        boolean result1 = Util.<Integer, String>compare(p1, p2);
        //제네릭메소드를 호출할 시, 이렇게 구체적 명시해줘도 좋고 안해도 문제는 없음.
        //리턴타입 앞에있는 <K,V>에 각각 정수와 문자열타입을 넣겠다고 명시하는 것이다. 안해도 컴파일러가 자동으로 매개값의 타입을 인식해줌.
        System.out.println(result1);


        Pair<Double, String> p3 = new Pair<>(3.14, "Easy");
        Pair<Double, String> p4 = new Pair<>(3.14, "Hard");
        boolean result2 = Util.compare(p3, p4);
        System.out.println(result2);
    }
}

