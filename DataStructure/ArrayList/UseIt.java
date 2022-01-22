package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class UseIt {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println(numbers);

        numbers.add(1, 80); //1번인덱스공간에 80을 넣고싶다. 한칸씩 밀어서 넣는다.
        System.out.println(numbers);

        System.out.println(numbers.get(2));

        numbers.remove(2);
        System.out.println(numbers);

        Iterator iterator = numbers.iterator();
        //Iterator 는 인터페이스이고, ArrayList 는 그것의 구현클래스이다.
        while (iterator.hasNext()) {
            int value = (int) iterator.next();
            if (value == 30)
                iterator.remove();
        }

        for (int value : numbers) {
            System.out.print(value + " ");
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }

    }
}
