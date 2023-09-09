package factoryMethod;

public class Main {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactoryImplementation();
        Product concreteProduct = productFactory.getConcreteProduct(6);
        System.out.println(concreteProduct.getId());
    }
}
