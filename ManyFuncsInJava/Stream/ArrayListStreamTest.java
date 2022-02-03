package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {

        List<String> sList = new ArrayList<>();  //자식객체가 부모타입변수에 할당되므로 자동타입변환 발생

        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");

        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.println(s));

        sList.stream().sorted().forEach(s -> System.out.println(s));
        sList.stream().map(s -> s.length()).forEach(s -> System.out.println(s));
        sList.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.println(s));
        //연산이 이루어진다고해서 그 연산이 기존의 자료를 바꾸진 않는다.
        //sorted 나 map 등은 중간연산이고,forEach 는 최종연산이다. 중간과 최종으로 이루어진다.
        //연산을 한번하면 스트림은 소모된다. 그래서 연산 할때마다 스트림을 생성해줘야 하는데 sList.stream() 처럼 해준다.
    }
}
