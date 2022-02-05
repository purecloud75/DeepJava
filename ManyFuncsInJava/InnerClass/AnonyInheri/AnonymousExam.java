package InnerClass.AnonyInheri;

public class AnonymousExam {
    public static void main(String[] args) {

        Anonymous anonymous = new Anonymous();

        anonymous.field.wake();
        anonymous.method1();
        anonymous.method2(new Person(){
            void study() {
                System.out.println("공부합니다.");
            }
            @Override
            void wake()  {
                System.out.println("8시에 일어납니다.");
                study();
            }
        });  //매개변수로 자식객체(익명객체)를 실시간으로 만들어서 보내준다. 이거 왜 쓰냐면 일회용으로 쓰기 딱 좋아서이다.
    }
}
