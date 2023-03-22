/**
 *  定义一个方法getMax，接收两个int参数，返回较大的一个数。
 */
public class MethodTest04 {
    public static void main(String[] args) {
        //定义两个变量
        int a = 4;
        int b = 5;
        //定义max接收返回来的最大值
        int max = getMax(a,b);
        //进行打印
        System.out.println(max);
    }

    public static int getMax(int num1, int num2){
        return num1 > num2 ? num1 : num2;//接收num1和num2 用三目运算符进行比较大小 并返回最大的数
    }
}
