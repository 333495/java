package homework;
/*
    军车
 */
public class Truck implements Car{

    @Override
    public void run() {
        System.out.println("🚗跑80km/小时");
    }

    /*
        特有的运输货物
     */
    public void yunShu(){
        System.out.println("货车运输货物");
    }
}
