import java.util.Scanner;

/**
 * 2.判断一个数是否是3的倍数
 */
public class If05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================判断是否为3的倍数====================\n");
        System.out.println("请输入一个数：");
        int num = scanner.nextInt();
        if (num % 3 == 0) {
            System.out.println(num + "是3的倍数！");
        }else {
            System.out.println(num + "不是3的倍数！");
        }
    }
}
