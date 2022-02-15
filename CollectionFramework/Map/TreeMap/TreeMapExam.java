package Map.TreeMap;

import java.util.*;

public class TreeMapExam {
    public static void main(String[] args) {

        //treeSet treeMap 은 인터페이스가아닌 클래스로 바로 타입을 붙이는데 자기만의 고유한 메소드들을 활용하기 위함이다.
        //아래에 나오는 메소드들은 Map 인터페이스를 구현한 treeMap 클래스의 고유한 메소드들이다.
        //Map 인터페이스의 하위인터페이스인 NavigableMap 인터페이스가 나온다.
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("apple", 10);
        treeMap.put("cookie", 80);
        treeMap.put("banana", 20);
        treeMap.put("orange", 40);
        treeMap.put("cherry", 50);
        treeMap.put("strawberry", 60);
        treeMap.put("bread", 30);

        Map.Entry<String, Integer> entry = null;

        //키가 String 타입이어서 유니코드로 가장낮고 높은것을 비교하네. 그래서 의도와는 다르게 나옴. 양해바랍니다.
        entry = treeMap.firstEntry();
        System.out.println(entry.getKey() + " : " + entry.getValue());
        entry = treeMap.lastEntry();
        System.out.println(entry);
        entry = treeMap.lowerEntry("orange");
        System.out.println(entry);
        entry = treeMap.higherEntry("cookie");
        System.out.println(entry);


        //descendingMap()는 내림차순으로 정렬된 NavigableMap 객체를 리턴하는데,
        //NavigableMap 는 treeMap(Map 의 구현클래스) 과 마찬가지로  firstEntry()부터 descendingMap()까지 거의 비슷하게 제공한다.
        NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
        NavigableMap<String, Integer> ascendingMap = descendingMap.descendingMap();
        //2번 호출했으므로 오름차순정렬 Map 컬렉션이다.
        //entrySet()키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 Set(구슬주머니)에 담아서 리턴
        Set<Map.Entry<String, Integer>> ascendingEntrySet = ascendingMap.entrySet();
        //Set 컬렉션에 Map.Entry 객체들이 순서없이 중복없이 뒤섞여있는것이고, 거기서 하나씩 뽑아서 거기의 키와 값을 뽑아서 출력 반복한다.
        for (Map.Entry<String, Integer> fruit : ascendingEntrySet) {
            System.out.println(fruit.getKey() + " : " + fruit.getValue());
        }


        System.out.println("c~f  사이의 단어 검색");
        NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "f", true);
        for (Map.Entry<String, Integer> any : rangeMap.entrySet()) {
            System.out.println(any.getKey() + " : " + any.getValue());
        }

    }
}
