package polymophic02;

public class Person extends Animal{
    @Override
    public void eat(){
        System.out.println("吃吃牢饭");
    }

    public void feed(Dog dog){
        dog.eat();
        if (dog instanceof Husky h){
            h.chaJia();
        }else if(dog instanceof Teddy t){
            t.duiDui();
        }else if(dog instanceof TuDog t){
            t.kanJia();
        }
    }

}
