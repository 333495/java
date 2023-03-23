package interface01;

public class Person implements IMove{
    @Override
    public void jump() {
        System.out.println("人类在跳");
    }

    @Override
    public void move() {
        System.out.println("人类移动");
    }

    @Override
    public void run() {
        System.out.println("人类跑啊....");
    }

    @Override
    public void run1() {
        System.out.println("人类跑1");
    }
}
