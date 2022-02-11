package Generic.Double;

public class Util {

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        //리턴타입 앞에 <K,V>처럼 타입파라미터를 선언해야한다. 리턴타입과 매개변수타입에 이것을 사용하겠다고 선언하는 것이다.
        //매개변수타입 혹은 리턴타입으로 타입파라미터(T 등)을 갖는 메소드를 제네릭메소드라고 하고, 이것이 그 예이다.
        boolean keyCompare = p1.getKey().equals(p2.getKey());
        boolean valueCompare = p1.getValue().equals(p2.getValue());
        return keyCompare && valueCompare;
    }
}
