package Collection.List;

import java.util.*;

public class ArrayListExam {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        //기본생성자로 ArrayList 객체를 생성하면, 내부에 10개의 객체를 저장할 수 있는 초기용량을 가지게 된다.

        list.add("정은비");
        list.add("황은비");
        list.add(1, "김예원");
        list.add("비비지");
        list.add("응원한다");

        int size = list.size();
        System.out.println(size);

        String skill = list.get(2);
        System.out.println(skill);

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + " : " + str);
        }

        list.remove(4);
        list.remove("김예원");
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + " : " + str);
        }
    }
}

/*
List 컬렉션은 객체를 일렬로 늘어놓은 구조이다. 객체를 인덱스로 관리하기때문에 객체를 저장하면 자동인덱스가 부여되고
인덱스로 검색, 삭제할 수 있는 것이다. 객체자체의 저장이 아닌 객체번지의 참조이다.

일반배열과 달리 ArrayList 는 자동으로 저장용량을 늘려준다. 큰 장점. 하지만 중간에 추가, 삭제를 할 시에는 해당인덱스 다음의 객체부터
끝의객체까지 뒤에 모든아이들이 한칸씩 뒤로밀리거나 한칸씩 앞으로채우면서와서 효울이 떨어진다. 이럴 때를 위한 것이 바로 LinkedList 이다.
Vector 는 ArrayList 와 거의 같은데 차이점이 동기화된 메소드로 구성되있어서, 멀티스레드가 동시에 이 메소드들을 실핼할 수 없어서
멀티스레드 환경에서 안전하게 객체를 추가, 삭제 할 수 있는 보완점이 있다. 중간에 추가삭제 or 안전한 멀티스레드환경이 필요없다면 ArrayList!!!
 */