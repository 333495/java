/**
 * 编写程序交换两个变量的值，如：int a=4,int b=7交换两个变量的值，交换后：a=7,b=4;
 */

public class Practice5 {
    public static void main(String[] args) {
        //方案一
        int a = 4;
        int b = 7;
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("a = " + a +", b = " +b);
        //方案二
        int a1 = 4;
        int b1 = 7;
        a1 = a1 + b1;
        b1 = a1 - b1;
        a1 = a1 - b1;
        System.out.println("a1 = " + a1 +", b1 = " +b1);
    }
}
