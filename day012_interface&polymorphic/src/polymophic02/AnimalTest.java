package polymophic02;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Person();

        a1.eat();
        a2.eat();

        System.out.println("--------------------------------");
        Person person = new Person();
        Husky husky = new Husky();
        Teddy teddy = new Teddy();
        TuDog tDog = new TuDog();
        person.feed(husky);
        person.feed(teddy);
        person.feed(tDog);
    }
}