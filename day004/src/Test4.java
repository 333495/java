import java.util.Scanner;

/**
 * 用if-else if else实现通过变量age的值判断，
 *              如果age小于18打印“父母负责”，
 *              age大于等于18并且小于60打印自己负责，
 *              age大于登录60大于“子女负责”
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println("==============判断年龄===============");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个年龄：");
            int age = scanner.nextInt();
            if (age >= 0 && age < 18){
                System.out.println("父母负责");
            }else if (age >= 18 && age< 60){
                System.out.println("自己负责");
            }else if (age >= 60){
                System.out.println("子女负责");
            }else {
                System.out.println("输入不合法！");
            }
        }
    }
}
