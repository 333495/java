/**
 *  定义一个方法，接受三个int参数，返回最小的一个数。
 */
public class MethodTest05 {
    public static void main(String[] args) {
        //定义三个数
        int a = 121;
        int b = 5;
        int c = 3;
        int min = getMin(a,b,c);
        System.out.println(min);
        int max = getMax(a,b,c);
        System.out.println(max);
    }
    //定义静态的方法
    public static int getMin(int num1, int num2, int num3){
        return num1 > num2 ? (num2 > num3 ? num3 : num2) : (num1 > num3 ? num3 : num1);
    }
    public static int getMax(int num1, int num2, int num3){
        return num1<num2?(num2<num3?num3:num2):(num1<num3?num3:num1);
    }
}
