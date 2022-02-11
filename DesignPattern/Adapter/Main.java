package Adapter;

public class Main {
    public static void main(String[] args) {

        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);
        //hairDryer 는 Electronic110V 인터페이스의 구현객체이므로 저 메소드에 들어갈수있고, 전원이 켜진다.

        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);
    }

    //우리집에는 110v가 사용가능한 콘센트가 있다.
    public static void connect(Electronic110V any) {
        any.powerOn();
    }
}

//호환성이 없는 기존클래스의 인터페이스를 변환하여 재사용 할 수 있도록 한다.
//프록시는 대리인 이라는 뜻으로써, 뭔가를 대신해서 처리하는 것이다
//프록시 클래스를 통해서 대신 전달하는 형태로 설계되며, 실제 클라이언트는 프록시로부터 결과를 받는다.


