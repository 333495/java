package homework;
/*
    军车
 */
public class MiCar implements Car{
    @Override
    public void run() {
        System.out.println("军车跑150km/小时");
    }
    /*
        军车放炮
     */
    public void fangPao() {
        System.out.println("军车放炮");
    }

}
