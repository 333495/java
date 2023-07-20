import java.util.Scanner;

/**
 * 键盘输入
 */
public class ScannerTest01 {
    public static void main(String[] args) {
        //相比较2个数的 大小
        System.out.println("============比大小============");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入第一个数：");
            int a = scanner.nextInt();//接收键盘值
            System.out.println("请输入第二个数：");
            int b = scanner.nextInt();//接收键盘值
            System.out.println("请输入第三个数：");
            int c = scanner.nextInt();//接收键盘值
            System.out.println("最大的数字是：" +(a<b ? (b<c ? c : b) : (a<c ? c : a)));
            System.out.println("最小的数字是：" +(a > b ? (b > c ? c : b) : (a > c ? c : a)));
        }
    }
}
