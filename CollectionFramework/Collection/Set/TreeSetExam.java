package Collection.Set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExam {
    public static void main(String[] args) {

        //treeSet treeMap 은 인터페이스가아닌 클래스로 바로 타입을 붙이는데 자기만의 고유한 메소드들을 활용하기 위함이다.
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(70);
        scores.add(80);
        scores.add(90);
        scores.add(100);

        Integer score = null;

        score = scores.first();
        System.out.println("가장 낮은 객체" + score);

        score = scores.last();
        System.out.println("가장 높은 객체" + score);


        //descendingSet()는 내림차순으로 정렬된 NavigableSet 객체를 리턴하는데, 
        //NavigableSets 는 treeSet 과 마찬가지로  first()부터 descendingSet()까지 거의 비슷하게 제공한다.
        NavigableSet<Integer> descendingSet = scores.descendingSet();
        NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();  //2번 호출했으므로 오름차순정렬 Set 컬렉션이다.
        for (Integer num : ascendingSet) {
            System.out.println(num + " ");
        }


        // 70 <= x < 100 에 해당하는 객체만 rangeSet 은 저장한다는 의미. String 타입이었으면 유니코드로 비교.
        NavigableSet<Integer> rangeSet = scores.subSet(70, true, 100, false);
        for (Integer num2 : rangeSet) {
            System.out.println(num2 + " ");
        }

        while (!scores.isEmpty()) {
            score = scores.pollFirst();  //가장낮은객체를 하나빼고 컬렉션에서 제외시킴.
            System.out.println(score + "(남은 객체수 = " + scores.size() + ")");
        }

    }
}
/*
이진트리 기반으로 한 Set 컬렉션이다. 하나의 노드는 노드값인 value, 왼쪽과 오른쪽 자식노드를 참조하기위한 두 개의 변수로 구성된다.
TreeSet 에 객체를 저장하면 자동으로 정렬된다.
 */
