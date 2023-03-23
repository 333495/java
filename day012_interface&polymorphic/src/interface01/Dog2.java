package interface01;

public class Dog2 implements IMove2{

    @Override
    public void jump2() {
        System.out.println("狗狗在跳.....");
    }

    @Override
    public void move() {
        System.out.println("狗狗在移动ing...");
    }

    @Override
    public void run2() {
        System.out.println("狗狗在跑ing...");
    }
}
