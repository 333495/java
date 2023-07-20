/**
 * 运算符 + - * /（商） %（余数）
 */

public class Cast02 {
    public static void main(String[] args) {
        int i = 3;
        int j = 6;
        System.out.println(i + j);//9
        System.out.println(i - j);//-3
        System.out.println(i * j);//18
        System.out.println(i / j);//0
        System.out.println(i % j);//3

        System.out.println("====================");
        System.out.println(10 / 3);// 3
        System.out.println(10.0 / 3);//3.3333333333333335
//        System.out.println(0 / 0); Exception in thread "main" java.lang.ArithmeticException: / by zero 0不能被作为除数
        System.out.println(0.0 / 0.0);// 结果是NaN，任何的NaN都不能等于字节 0.0 double类型 不精确
        System.out.println(1.0 / 0.0);// Infinity 无穷大

        System.out.println(153 / 10); // 15
        System.out.println(153 % 10); // 3




    }
}
