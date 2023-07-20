
/**
 * 测试类
 */
public class RectangleTest01 {
    public static void main(String[] args) {
        //宽
        int width = 5;
        //长
        int height = 6;
        //创建对象
        Rectangle test = new Rectangle();
        //输出乘积
        System.out.println("乘积：" + test.getArea(width, height));
    }
}