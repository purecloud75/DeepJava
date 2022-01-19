package Object;

public class AboutObject {
}

/*
Object 클래스는 모든 클래스의 최상위클래스.
java.lang 패키지 안에 있으며, 프로그래밍 시 import 하지 않아도 자동으로 import 됨.
String, System, hashCode, toString, wait, clone 등 우리가 많이 써온 클래스가 들어있는 아이다.
public class AboutObject 은 사실 public class AboutObject (extends Object) 가 생략된 것이다. 즉 상속받는 거지 모든 클래스들은
그렇기에 Object 클래스에 정의된 메소드들 중 final 이 아닌 메소드에 대해서는 얼마든지 Overriding 이 가능한 것이다.
 */