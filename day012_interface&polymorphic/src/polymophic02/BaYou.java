package polymophic02;

public class BaYou extends Animal2{
    @Override
    public void hit() {
        System.out.println("打🐖，很开心");
    }

    public void kill(Animal2 animal) {
        animal.hit();
        if (animal instanceof Pig pig){
            pig.hit();
        }else if (animal instanceof Cat cat){
            cat.hit();
        }
    }
}
