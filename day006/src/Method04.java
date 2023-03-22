import java.util.Scanner;

public class Method04 {
    public static void main(String[] args) {
//        if (sum1(1,2) % 2 == 0){
//            System.out.println("偶数");
//        }else {
//            System.out.println("奇数");
//        }

        //判断奇偶数
        System.out.println(sum1(1,2) % 2 == 0 ? "偶数" : "奇数");

        //判断两个数的和是否大于二。
        boolean flag = sum2(1,2);
        if (flag == true){
            System.out.println("大于二");
        }else {
            System.out.println("小于二");
        }

        //判断质数

//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();


        //强转返回值
        System.out.println((char) sum1(-42221,0));
    }

    //求两个数的和
    /*
        void 是 没有返回值的
             但是需要有返回值 就把void 换成 返回值的类型
             需要加return 关键字 return结果就好了
     */
    public static void sum(int a,int b){
        System.out.println(a +b);
    }

    //带返回值
    public static int sum1(int a, int b){

        int c = a + b;

        return c;
    }

    public static boolean sum2(int a, int b){

        int c = a + b;
        if (c > 2){
            return true;//如果 方法有返回值 那必须保证 方法在任何情况下 都有返回值
        }
        return false;
    }

}
