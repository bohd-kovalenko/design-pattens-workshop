package abstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new CurrentFactory();
        Walking human = abstractFactory.getWalking();
        Flyable bird = abstractFactory.getFlyable();
        human.move();
        bird.fly();
    }
}
