package factoryMethod;

public record ConcreteProduct(int id) implements Product {
    @Override
    public int getId() {
        return id;
    }
}
