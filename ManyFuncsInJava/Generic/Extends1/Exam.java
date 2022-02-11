package Generic.Extends1;

public class Exam {
    public static void main(String[] args) {

        //int result1 = Util.compare("a","b");  String 은 Number 클래스의 자식클래스가 아니므로 오류이다.
        int result1 = Util.compare(10, 20);
        System.out.println(result1);

        int result2 = Util.compare(3.14, 0);
        System.out.println(result2);
    }
}
