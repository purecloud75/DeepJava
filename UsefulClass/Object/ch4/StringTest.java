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
자바는 클래스와 인터페이스의 메타 데이터를 java.lang 패키지에 소속된 Class 클래스로 관리하는데,
여기서 메타데이터란 클래스의 이름, 생성자정보, 필드정보, 메소드정보를 말한다.
Class 객체의 생성방법은 2가지
1. Object 의 getClass()를 이용한다. 모든 자식객체는 부모메소드 이용가능하므로 모든클래스가 이 메소드를 이용할 수 있다.
단 해당 클래스로 객체가 이미 생성되었을때만 사용가능. Class 클래스는 생성자가 감추어져있어 new 로 객체생성이 불가하여 2가지 방법을 이용한다.
2. Class 의 정적메소드인 forName()을 이용한다. 이 메소드는 클래스 전체이름(패키지포함)을 매개값으로 받는다.
매개값에 들어간 클래스를 찾지못하면 예외발생. 그래서 이 메소드를 호출하는 시점에 try{}안에 있어야 한다.

자바의 모든 클래스와 인터페이스는 컴파일 후에 class 파일이 생성된다.
class 클래스는 컴파일 된 class 파일을 로드하여 객체를 동적 로드하고, 정보를 가져오는 메소드가 제공된다.
Class.forName("클래스 이름") 메소드로 클래스를 동적으로 로드한다.
동적로딩이란 runtime(실행)중에 데이터타입을 binding 하는 방법으로, 프로그래밍 시에는 문자열변수로 처리했다가 런타임 시에는 원하는 클래스를
로딩하여 binding 할 수 있다는 장점이 있다. 다만 컴파일 시에 타입이 정해지지 않으므로 동적로딩 시에 오류발생 가능성 있다.
 */