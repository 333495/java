/**
 * 长方形的类
 */
public class Rectangle {
    /** 宽 */
    int width;
    /** 长 */
    int height;

    //无参构造器
    public Rectangle() {

    }
    //求面积
    public double getArea(int width, int height){
        //公式
        int x = width * height;
        //返回乘积
        return x;
    }
}
