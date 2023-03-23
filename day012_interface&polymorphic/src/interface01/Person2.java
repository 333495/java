package interface01;

public class Person2 implements IMove2{
    @Override
    public void jump2() {
        System.out.println("人类在跳舞");
    }

    @Override
    public void move() {
        System.out.println("人类在移动中");
    }

    @Override
    public void run2() {
        System.out.println("人类在跑步中");
    }
}
