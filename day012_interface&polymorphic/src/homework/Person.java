package homework;
/*
    人类
 */
public class Person {
    /*
        人类开车的方法，因为要开很多种车，所以要进行判断
     */
    public void driver(Car car){
        car.run();
        if(car instanceof MiCar miCar){
            miCar.fangPao();
        }else if(car instanceof BullCar bullCar){
            bullCar.eat();
        }else if(car instanceof Truck truck){
            truck.yunShu();
        }
    }
}
