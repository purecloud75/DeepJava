package Generic.Extends1;

public class Util {
    public static <T extends Number> int compare(T num1, T num2) {
        //Number 클래스의 자식클래스만이 T를 대체할 수있다는 의미
        double v1 = num1.doubleValue();
        double v2 = num2.doubleValue();
        //Number 에 있는 멤버인 doubleValue()를 썼다. 부모 또는 인터페이스에 선언된 멤버만 중괄호에서 사용가능
        return Double.compare(v1, v2);
    }
}

/*
public <T extends 상위타입> int compare(T num1, T num2)
타입매개변수인  T를 대체할 수 있는 클래스는 상위타입을 상속받는 하위클래스거나 상위타입을 구현하는 구현클래스뿐이다.
상위타입은 상위클래스도 되고, 인터페이스도 된다. 그래서 타입매개변수에 올 수 있는 경우를 제한하는 데에 쓰인다.

주의사항은 메소드의 중괄호{} 안에서 상위타입에 해당하는 상위클래스의 멤버 혹은 인터페이스의 멤버에만 접근이 가능하다.
하위클래스인 T에, 상위타입에는 없는 메소드를 선언했다면 이 메소드를 중괄호안에서 못 쓴다는 말이다.
그럴수밖에 없는게 T에 누가올지 모르니까 공통되는 것만 쓸 수밖에.
 */
