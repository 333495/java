/**
 * 设计一个方法求多个整数积的方法(可变参数)
 * (提示：定义一个方法，方法的参数是 int 数组，参考求多个整数和的示例)
 */
public class MethodTest06 {
    public static void main(String[] args) {
        int[] ss = {1,2,3,3,4,45,5,43,5};//1*2*3*4
        multiply(ss);
    }
    //定义一个方法，方法的参数是 int 数组
    public static void multiply(int... a){

        int b = 1;
        for (int c:a) {
            b *= c;// b = b * c;
        }
        System.out.println("乘积是：" +b);
    }
}
