package factoryMethod;

public class ProductFactoryImplementation implements ProductFactory{
    @Override
    public Product getConcreteProduct(int id) {
        return new ConcreteProduct(id);
    }
}
