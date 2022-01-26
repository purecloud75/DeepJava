package Generic;

public class GenericPrinter<T extends Material>{
    //Material 클래스를 상속하는 하위 클래스타입만이 이 T(자료형 매개변수)에 올 수 있다는 의미. 즉 T의 사용범위를 제한하는 효과.
    //공통으로 쓸 수 있는 여러 메소드들을 상위클래스에 지정할 수 있다. 이거는 선택사항임.

    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString() {
        return material.toString();
    }
}
//제너릭메소드를 꼭 제너릭클래스에서만 쓸수있는게 아님을 보여주고싶어서 굳이 실행클래스에서 메인메소드 바깥에 제너릭메소드를 정의하고 활용함.