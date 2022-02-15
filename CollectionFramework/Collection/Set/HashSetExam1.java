package Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam1 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("qqq");
        set.add("www");
        set.add("eee");
        set.add("qqq");
        set.add("ttt");

        System.out.println(set.size());

        //Iterator 인터페이스타입의 참조변수에 구현객체를 넣는다. iterator()를 호출하면 구현객체를 리턴해준다.
        //가져올 객체가 있으면 hasNext()는 true 를 리턴하고, next()로 컬렉션에서 객체 하나를 가져온다. 이런 구문으로 많이 쓰인다.
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        set.remove("eee");
        set.clear();
        if (set.isEmpty()) {
            System.out.println("비어있음");
        }
    }
}
