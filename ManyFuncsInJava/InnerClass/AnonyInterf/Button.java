package InnerClass.AnonyInterf;

public class Button {

    OnClickListener listener;
    //생성자에 한 줄로 쓸 수있는걸 굳이 2개로 나누었는데 이게 더 가독성이 좋고 여러모로 좋다.

    void setOnClickListener(OnClickListener abc) {
        this.listener = abc;
    }  //여기서 해당인터페이스의 구현객체를 할당받겠다는 의미

    void touch() {
        listener.onClick();
    }

    interface OnClickListener {
        void onClick();
    }
}
