package Object.ch2;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student Jung = new Student(20150115, "eunbi");
        Student Hwang = new Student(20150115, "eunbi");

        System.out.println(Jung == Hwang);
        //new 로 생성될 때마다 별도의 객체가 생기므로, 논리적(값)으로 같아도 물리적(주소)으로 다르기에 false 가 나온다.
        System.out.println(Jung.equals(Hwang)); //원래는 false 이지만, 메소드재정의에 의해서 true 를 반환한다.



        System.out.println(Jung.hashCode()); //1324119927. 메소드재정의를 했더니 둘다 20150115로 같아졌다.
        System.out.println(Hwang.hashCode()); //990368553. 논리적으로 같아졌기때문에 같은 해시코드가 반환되었다.

        System.out.println(System.identityHashCode(Jung)); //1324119927. 원래 해시코드값이 나온다. for 오버라이딩 이전의 기능
        System.out.println(System.identityHashCode(Hwang)); //990368553



        Student copyJung1 = (Student) Jung.clone();
        System.out.println(copyJung1);

        Jung.setStudentNum(20200713);
        Student copyJung2 = (Student) Jung.clone();
        //Jung 은 Student 클래스타입 객체이고, Student 는 Object 의 상속을 받기에, Object 의 메소드인 clone 에 접근이 가능하다.
        //자식객체가 부모타입에도 접근이 가능하기에 그렇다. 생성자 생성순서 그거! 그렇기에 clone()의 리턴타입은 Object 이다.
        //그래서 강제타입변환을 해주었다. 그리고 예외처리를 별도로 해주었다. 클로너블하지 않은데 클론하려해서 오류생길 수 있음.
        System.out.println(copyJung2);
        //해당 객체의 클래스에서 toString()을 재정의하면,
        //객체변수를 바로 출력시에 그 객체변수에 할당된 객체주소값이 아닌, 자동으로 toString()이 호출되어, 문자열을 출력한다.
    }
}
/*
equals()는 본래 두 객체의 주소값을 비교하는 친구다. ==처럼.
하지만 재정의를 통해 물리적(주소값)이 아닌 논리적(들어있는 데이터)으로 같은지를 확인하고싶다.
hashCode()는 key 를 해시함수의 매개값으로 넣었을 때 리턴값을 반환하는 메소도로, 객체의 주소를 int 로 변환해서 반환한다. 객체의 지문이다.
equals()를 오버라이딩하면 hashCode()도 오버라이딩 해야한다. 전자의 결과가 true 이면, 두 객체의 해시코드는 같아야 하기 때문

clone()은 객체를 복사해주는 메소드로, 생성자를 통하지 않고 인스턴스를 그대로 복제한다.
 */