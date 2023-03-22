import java.util.Scanner;

/**
 * 用if-else语句判断一个数是奇数还是偶数。
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println("==============判断奇偶===============");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个数：");
            int num = scanner.nextInt();
            if (num % 2 == 0){
                System.out.println(num + "是偶数！");
            }else {
                System.out.println(num + "是奇数！");
            }
        }
    }
}
