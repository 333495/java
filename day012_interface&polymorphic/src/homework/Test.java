package homework;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Person person = new Person();
        MiCar miCar = new MiCar();
        Truck truck = new Truck();
        BullCar bullCar = new BullCar();

        //人类分别开不同的车，并且调用每一个车的特有方法
        person.driver(miCar);
        person.driver(truck);
        person.driver(bullCar);


    }
}