package interface01;

public class Test2 {
    public static void main(String[] args) {
        Person2 person = new Person2();
        Dog2 dog = new Dog2();
        person.run2();
        person.move();
        person.jump2();
        System.out.println("================================");
        dog.jump2();
        dog.move();
        dog.run2();
    }
}