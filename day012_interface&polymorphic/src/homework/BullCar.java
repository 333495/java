package homework;
/*
    牛车
 */
public class BullCar implements Car{
    @Override
    public void run() {
        System.out.println("🐂车跑10km/小时");
    }
    /*
        牛吃草
     */
    public void eat(){
        System.out.println("牛车需要吃草");
    }
}
