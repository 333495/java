package polymophic02;


public class Animal2Test {
    public static void main(String[] args) {
        BaYou baYou = new BaYou();
        Pig pig = new Pig();
        Cat cat = new Cat();
        baYou.hit();
        baYou.kill(pig);
        baYou.kill(cat);
    }
}