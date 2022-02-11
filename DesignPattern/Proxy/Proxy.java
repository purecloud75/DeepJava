package Proxy;

public class Proxy implements IService {

    IService service1;

    @Override
    public String runSomething() {
        System.out.println("프록시에서 호출됨");
        service1 = new Service();
        //Service 클래스의 접근제어자가 public 이므로 아무곳에서나 써도 문제없음.
        return service1.runSomething();
    }
}
