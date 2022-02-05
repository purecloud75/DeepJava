package InnerClass.AnonyInterf;

//얘는 Button 클래스 내의 중첩인터페이스타입의 변수에 익명구현객체를 할당해주는 역할만 하는 클래스이다.
public class Window {

    Button b1 = new Button();
    Button b2 = new Button();

    Button.OnClickListener listener = new Button.OnClickListener() {
        //익명구현객체(이름이 없는, 일회용의 중괄호 내에서 정의된 간이클래스의 실체화)를 인터페이스타입 참조변수에 할당
        @Override
        public void onClick() {
            System.out.println("전화를 겁니다.");
        }
    };

    Window() {
        b1.setOnClickListener(listener);

        b2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("메시지를 보냅니다.");
            }
        });

    }
}
