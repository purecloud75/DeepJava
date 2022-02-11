package Decorator;

public class AudiDecorator implements ICar {

    protected ICar audi;
    protected String modelName;
    protected int modelPrice;

    public AudiDecorator(ICar audi, String modelName, int modelPrice) {
        this.audi = audi;
        this.modelName = modelName;
        this.modelPrice = modelPrice;
    }

    @Override
    public int getPrice() {
        return audi.getPrice() + modelPrice;
        //기본가격에 해당모델의 가격을 추가하여 최종 아우디차량의 금액을 산정한다. 아우디는 a3 a4 등급에 따라 가격이 더 올라가거든
    }

    @Override
    public void showPrice() {
        System.out.println(modelName + "의 가격은 " + this.getPrice() + "원 입니다.");
    }
}
