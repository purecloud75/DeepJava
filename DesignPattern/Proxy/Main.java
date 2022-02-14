package Proxy;

public class Main {
    public static void main(String[] args) {

        IService proxy = new Proxy();
        System.out.println(proxy.runSomething());
    }
}

/*
proxy 는 대리자입니다. 다른 누군가를 대신해서 그 역할을 수행하는 존재이다. 프록시에게 어떤 일을 시키는 거다
클라이언트가 어떤 일에대한 요청(Service 클래스내의 메소드를 호출)을 하면, proxy 가 대신 Service 의 메소드를 호출하고
그 반환값을 클라이언트에게 전달합니다. 클라이언트는 Main 클래스이고, 원래클래스는 Service 이고, 프록시(비서)클래스는 Proxy 이다.
 */