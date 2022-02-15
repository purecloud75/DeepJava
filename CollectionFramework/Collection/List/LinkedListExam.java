package Collection.List;

import java.util.*;

public class LinkedListExam {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        List<String> list0 = new Vector<>();

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("추가하는데 걸린시간 : " + (endTime - startTime));


        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("추가하는데 걸린시간 : " + (endTime - startTime));
    }
}
