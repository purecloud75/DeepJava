package Object.ch4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {
    public static void main(String[] args) throws ClassNotFoundException {

        Class c = Class.forName("java.lang.String");  //해당 클래스가 없으면 예외클래스가 실행되도록 장치해둠.

        Constructor[] cons = c.getConstructors();
        for (Constructor anything : cons) {
            System.out.println(anything);  //java.lang.String(String 클래스의 풀네임)에 정의된 생성자들의 시그니처 한줄을 출력!
        }
        System.out.println("====================================");

        Method[] meh = c.getMethods();
        for (Method anything : meh) {
            System.out.println(anything);
        }
    }
}
/*
자바의 모든 클래스와 인터페이스는 컴파일 후에 class 파일이 생성된다.
class 클래스는 컴파일 된 class 파일을 로드하여 객체를 동적 로드하고, 정보를 가져오는 메소드가 제공된다.
Class.forName("클래스 이름") 메소드로 클래스를 동적으로 로드한다.
동적로딩이란 runtime(실행)중에 데이터타입을 binding 하는 방법으로, 프로그래밍 시에는 문자열변수로 처리했다가 런타임 시에는 원하는 클래스를
로딩하여 binding 할 수 있다는 장점이 있다. 다만 컴파일 시에 타입이 정해지지 않으므로 동적로딩 시에 오류발생 가능성 있다.
 */