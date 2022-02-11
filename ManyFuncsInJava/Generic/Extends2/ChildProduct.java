package Generic.Extends2;

public class ChildProduct<K, M, C> extends Product<K, M> {
    //상위클래스 혹은 인터페이스(즉, 상위타입)이 제너릭타입이면, 자식클래스 혹은 구현클래스 또한 제너릭타입이어야하고, 타입파라미터 추가 가능
    private C company;

    public C getCompany() {
        return company;
    }

    public void setCompany(C company) {
        this.company = company;
    }
}
