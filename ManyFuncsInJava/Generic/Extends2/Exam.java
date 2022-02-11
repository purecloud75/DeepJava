package Generic.Extends2;

public class Exam {
    public static void main(String[] args) {

        ChildProduct<Tv, String, String> product = new ChildProduct<>();
        product.setKind(new Tv());
        product.setModel("smartTV");
        product.setCompany("samsung");

        System.out.println(product.getModel());


        Storage<String> storage = new StorageImpl<>(100);
        storage.add("남윤도", 0);
        storage.add("천국의문", 2);
        storage.add("20130123", 1);

        String str = storage.get(2);
        System.out.println(str);

    }
}
