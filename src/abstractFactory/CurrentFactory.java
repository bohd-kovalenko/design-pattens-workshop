package abstractFactory;

public class CurrentFactory implements AbstractFactory{
    @Override
    public Flyable getFlyable() {
        return new Bird();
    }

    @Override
    public Walking getWalking() {
        return new Human();
    }
}
