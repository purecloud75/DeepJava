package Generic;

public class RectTest {

    public static <T, V> double makeRect(Rect<T, V> p1, Rect<T, V> p2) {  
        //반환값자료형은 double 이고, 그 앞에 <T, V>를 붙인다. Rect<T, V>가 통째로 클래스 이름이다.
        double left = ((Number) p1.getX()).doubleValue();
        double right = ((Number) p2.getX()).doubleValue();
        double top = ((Number) p1.getY()).doubleValue();
        double bottom = ((Number) p2.getY()).doubleValue();
        //get()을 통해 인트던 더블타입이던 반환되면 그것을 Number 클래스타입으로 강제변환 후에, 더블로 변환해주는 메소드를 호출하여 할당함

        double width = right - left;
        double height = top - bottom;

        return width * height;
    }

    public static void main(String[] args) {
        Rect<Integer, Double> p1 = new Rect<Integer, Double>(0, 0.0);
        Rect<Integer, Double> p2 = new Rect<>(10, -10.0);
        //해당클래스에서 생성자매개변수의 모든 타입의 경우의수를 고려해서 다 만들고 고칠게 아니라 실행클래스에서 그때그때만 지정해주면 편리함.

        double area = RectTest.<Integer, Double>makeRect(p1, p2);
        //static 이므로 해당클래스의 이름에서 바로호출가능. <Integer, Double>makeRect 가 통째로 메소드의 이름이다.
        System.out.println("두 점으로 만들어진 사각형의 넓이는 " + area + " 입니다.");
    }
}
