import java.util.Scanner;

/**
 * 可变参
 */
public class Method03 {
    public static void main(String[] args) {
        sum1(1,2);
        sum2(1,2,2);
        sumn(1,2,3,34,43,23,2,32,42);
        System.out.println("===============================");
        //找大小
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个数：");
        int num2 = scanner.nextInt();
        System.out.println("请输入第三个数：");
        int num3 = scanner.nextInt();
        Method03 m = new Method03();
        int max = m.findMax(num1,num2,num3);
        System.out.println(max);
    }
    //两个数的和
    public static void sum1(int a,int b){
        System.out.println(a + b);
    }
    //三个数的和
    public static void sum2(int a,int b,int c){
        System.out.println(a + b + c);
    }
    //可变参
    public static void sumn(int... a){
        int sum = 0;
        for (int aa:a) {
            sum+=aa;
        }
        System.out.println(sum);
    }
    //三个数的最大的一个数
    public int findMax(int a, int b, int c){
        return a < b ? b < c ? c : b : a < c ? c : a;

    }
}
