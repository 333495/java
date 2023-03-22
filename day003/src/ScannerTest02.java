import java.util.Scanner;

/**
 * 求奇数、偶数
 */
public class ScannerTest02 {
    public static void main(String[] args) {
        System.out.println("################奇偶数################");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个数：");
            int num = scanner.nextInt();
            System.out.println( num % 2 == 0 ? "这个数是偶数！" : "这个数是奇数！");
        }
    }
}
