package abstractFactory;

public class Human implements Walking{
    @Override
    public void move() {
        System.out.println("Move one step forward");
    }
}
