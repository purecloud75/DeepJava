package Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExam {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("셜록", 30);
        map.put("왓슨", 95);
        map.put("허드슨", 90);
        map.put("모리아티", 85);
        map.put("셜록", 100);
        System.out.println(map.size());

        int num1 = map.get("셜록");
        System.out.println(num1);

        //keySet()은 키를 Set 타입의 구슬주머니에 넣어서 리턴. Set 은 구현객체를 리턴하는 iterator()가 있어서 객체생성 후 꺼내오기.
        //결과가 입력순서와는 다르게 출력됨. Set 인터페이스의 iterator()를 이용했기때문. Set 컬렉션은 순서도없고 중복도없다. 인덱스안쓴다.
        Set<String> setKey = map.keySet();
        Iterator<String> iterator = setKey.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key + " : " + value);
        }

        map.remove("허드슨");
        System.out.println(map.size());

        //Map.Entry<String, Integer> 도 하나의 타입으로 봐야한다. Entry 객체가 바로 이 타입이다.
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Integer> entry = iterator1.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }
}

/*
HashMap 의 키로 사용할 객체는 HashSet 처럼, hashCode()와 equals() 메소드를 오버라이딩해서 같은객체가 될 조건을 정해야한다.
키는 중복이 안되는것이 Map 컬렉션의 원칙이기에 논리적으로 같은 객체는(키가 같은객체)는 가장 나중에 들어온 친구것으로 대치된다.

String 클래스는 두 메소드가 의도에맞게 이미 오버라이딩이 잘 되있어서 보통 키의 타입으로 쓴다.
키와 값의 타입은 클래스와 인터페이스타입만 되므로, int 가 아닌 Integer 로 한다.
 */