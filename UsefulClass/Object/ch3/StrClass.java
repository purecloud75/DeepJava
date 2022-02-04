package Object.ch3;

import java.util.Date;

public class StrClass {
    public static void main(String[] args) {

        String s1 = "AAA";
        String s2 = "AAA";
        String s3 = "AAA";
        String s4 = "BBB";
        //String 도 클래스여서 new 로 생성할수도 있지만 이처럼 문자열리터럴(AAA)로 할당해주는게 더 좋다.
        //문자열리터럴은 프로그램 실행 시 자동으로 객체를 생성하고 constant pool(상수저장소)에 저장된다.
        //s1,s2,s3 는 "AAA"리터럴을 담고있는 하나의 객체를 참조하므로, 셋 모두 같은 주소값을 갖는다. 진짜 상수처럼 공유가 되네.
        //한번 초기화가 되면 다시는 내용변경이 불가하기에 상수처럼 사용한다. s1 = s1 + "BBB" 가 안된다는 의미이다.

        if (s1 == s3)
            System.out.println("ok");

        String s5 = "";
        String s6 = "";
        char c = ' ';

        if (s5 == s6)
            System.out.println("ok");

        Date dd = new Date();
        String currentTime = String.valueOf(dd);  //참조변수의 경우, toString()을 호출한 결과를 반환한다.
        System.out.println(currentTime);

        String currentTime2 = dd + "";  //이상 특정타입을 문자열로 바꾸는 2가지 방법
        System.out.println(currentTime2);
    }
}

/*
String 클래스 = 데이터(char[]) + 메소드(문자열 관련)
final class. 즉 내용변경이 불가하다. 덧셈으로 문자열을 결합할때마다 새로운 객체가 생성되는것이기 때문에 성능이 떨어진다.
문자열의 결합이나 변경이 잦다면, 내용을 변경가능한 StringBuffer 클래스를 쓰자.
 */
