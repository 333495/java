package interface01;

public class Dog implements IMove{
    @Override
    public void jump() {
        System.out.println("狗在跳...");
    }

    @Override
    public void move() {
        System.out.println("狗在移动");
    }

    @Override
    public void run() {
        System.out.println("狗在跑");
    }

    @Override
    public void run1() {
        System.out.println("狗在跑1");
    }
}
