package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        for (int number : arr) {
            System.out.println(number);
        }

        Arrays.stream(arr).forEach(a -> System.out.println(a));  //스트림 메소드를 호출하면 이것이바로 스트림을 생성하는 것이다.

        IntStream is = Arrays.stream(arr);
        is.forEach(b -> System.out.println(b));  //일회성 스트림. 한번 사용하면 소모.

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);

    }
}
