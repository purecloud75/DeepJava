package Object.ch4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args) throws Exception {

        Class c1 = Class.forName("Object.ch4.Person"); //최초의 패키지이름서부터 나열하자.
        Person person = (Person) c1.newInstance();  //new 처럼 객체를 생성하는 모습.

        person.setName("Jung");
        System.out.println(person);


        Class c2 = person.getClass(); //Person 클래스타입의 객체변수인 person 이 이미있을 때 사용가능한 메소드.
        Person person2 = (Person) c2.newInstance();

        person2.setName("Nam");
        System.out.println(person2);
    }
}
