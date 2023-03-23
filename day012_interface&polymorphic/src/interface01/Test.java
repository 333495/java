package interface01;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.jump();
        person.move();
        person.run1();
        person.run();
        System.out.println("================================");
        Dog dog = new Dog();
        dog.jump();
        dog.move();
        dog.run();
        dog.run1();
    }
}
