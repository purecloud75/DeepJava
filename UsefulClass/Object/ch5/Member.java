package Object.ch5;

import java.util.Arrays;

//저 인터페이스를 구현하지않은 클래스를 복제하려고 할 시, Exception 발생. 그래서 clone()을 호출할때는 반드시 try{}안에서 호출하자
public class Member implements Cloneable {

    public String name;
    public int age;
    public int[] scores;
    public Car car;

    public Member(String n, int a, int[] s, Car car) {
        name = n;
        age = a;
        scores = s;
        this.car = car;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Member clone = (Member) super.clone();
        //super 는 this 와 비슷하다. 다만 최상위객체를 나타낼 뿐. 생략해도 오류는 없다.
        //최상위클래스의 clone()을 호출하고, 반환타입이 Object 여서 강제타입변환 후 대입. clone 에 복제객체가 들어있다.
        clone.scores = Arrays.copyOf(this.scores, this.scores.length);
        clone.car = new Car(this.car.model);
        //NULL 이었을 복제객체의 참조타입필드에 현재객체(즉 원본객체)의 참조타입필드가 참조하는 배열과 Car 클래스의 객체의 주소를 할당해준다.
        return clone;
    }

    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("복제할 수 없는 클래스의 객체를 복제하려했기에 예외발생 예외발생");
            e.printStackTrace();
        }
        return cloned;
    }

}

/*
얕은복제는 단순히 필드값을 복사해서 객체를 복제하는 것이다. 필드가 기본타입이면 값 복사가, 참조타입이면 객체의 주소가 복사된다.
즉 복제된 객체나 원래 객체나 참조타입필드에는 같은 객체의 주소가있으므로 한 객체만 바라봄. 그래서 한쪽에서 변경하면 나머지쪽도 변경되는 단점.

깊은복제는 참조하고있는 객체까지 직접 복사해서 객체를 복제하는 것이다.
원래객체의 배열(참조의 예시)필드에 대한 깊은복제가 있으면, 복제된객체의 배열필드가 참조하는 객체는 서로 다르며 그 안에 할당된 값만 똑같다.
 */
