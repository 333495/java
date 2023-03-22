import java.util.Scanner;

/**
 * 1.求出2个变量中的最大值
 *
 */
public class If04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================比大小====================\n");
        System.out.println("请输入第一个数：");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个数：");
        int num2 = scanner.nextInt();
        if (num1 > num2){
            System.out.println("最大的是：" + num1);
        }else {
            System.out.println("最大的是："+ num2);
        }
    }
}
