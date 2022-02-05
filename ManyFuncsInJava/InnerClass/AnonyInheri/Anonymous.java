package InnerClass.AnonyInheri;

public class Anonymous {

    //익명객체는 인터페이스의 구현객체 또는 부모클래스의 자식객체 이 2가지에서만 쓰인다.
    //부모타입에 자식객체를 할당하는 모습이다. 즉 부모클래스의 이름만 빌려서 중괄호안에 자식클래스를 만들고 그와 동시에 자식객체가 생성되어서
    //부모타입 참조변수인 field 에, 중괄호안의 클래스기반의 자식객체를 대입한다. 그래서 부모타입것만 쓸수있고 예외적으로 오버라이딩은 자식가능
    Person field = new Person() {
        void work() {  //자식클래스는 부모클래스의 상속도 받고 오버라이딩도 하고 본인의 것도 추가할수 있지 당연히.
            System.out.println("출근합니다.");
        }

        @Override
            //부모클래스인 Person 클레스의 wake()를 자식클래스에서 재정의하고있는 모습이다.
        void wake() {
            System.out.println("6시에 일어납니다.");
            work();
        }
    };

    void method1() {
        Person localVar = new Person() {
            void walk() {
                System.out.println("산책합니다");
            }

            @Override
            void wake() {
                System.out.println("7시에 일어납니다.");
                walk();
            }
        };

        localVar.wake();  //처음에는 부모타입의 wake()에 접근하지만, 오버라이딩이므로 예외적으로 자식클래스의 wake()가 실행될 것이다.
    }

    void method2(Person person) {  //자식객체에서 부모타입으로의 자동타입변환 발생
        person.wake();
    }
}
