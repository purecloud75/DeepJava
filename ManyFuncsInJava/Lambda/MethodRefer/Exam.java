package Lambda.MethodRefer;

public class Exam {
    public static void main(String[] args) {

        IntBinaryOperator operator;

        operator = new IntBinaryOperator() {
            @Override
            public int anything(int a, int b) {
                return Calculator.staticMethod(a, b);
            }
        };
        System.out.println("결과1 " + operator.anything(5, 8));

        //operator = (x, y) -> {return Calculator.staticMethod(x, y);};
        operator = (x, y) -> Calculator.staticMethod(x, y);
        System.out.println("결과2 " + operator.anything(5, 8));
        //람다식에 쓰이는 함인의 유일한메소드와 정적메소드의 시그니처가 같고 리턴타입도 같은 경우에 아래처럼 줄여서 쓸 수 있다.

        operator = Calculator::staticMethod;
        System.out.println("결과3 " + operator.anything(5, 8));
        //해당 타입의 함수형인터페이스의 유일한메소드의 시그니처와 리턴타입이, 계산기클래스의 정적메소드인 staticMethod 의 그것과 같구나!!



        operator = new IntBinaryOperator() {
            Calculator objj = new Calculator();
            //여기 중괄호 안은 구현클래스부분이기 때문에 재정의말고도 필드나 메소드 추가로 선언 및 정의가 가능하지.
            @Override
            public int anything(int a, int b) {
                return objj.instanceMethod(a, b);
            }
        };
        System.out.println("결과4 " + operator.anything(2, 70));

        Calculator obj = new Calculator();
        operator = (x, y) -> obj.instanceMethod(x, y);
        System.out.println("결과5 " + operator.anything(2, 70));

        operator = obj::instanceMethod;
        System.out.println("결과6 " + operator.anything(2, 70));
    }
}

/*
람다식은 함수적인터페이스의 하나뿐인 메소드를 구현한것이다. 익명구현객체의 간략화 버전이다.
종종 람다식은 기존 메소드를 단순하게 호출만 하는경우가 있다. 예를 들어 (left, right) -> Math.max(left, right) 가 있다고 할 때
저 소괄호 2번 반복되는게 싫다는거지. 그래서 Math :: max; 꼴로 단순화 할 수 있는데, 이것을 메소드참조 라고한다.
메소드를 참조해서 매개변수의 정보 및 리턴타입을 알아내서 람다식에서 불필요한 매개변수를 제거하는 것이 목적이라 할 수 있겠다.

함수형인터페이스에 선언된 유일한 메소드와 동일한 매개타입과 리턴타입을 갖는 메소드만이 참조대상이 된다.
 */