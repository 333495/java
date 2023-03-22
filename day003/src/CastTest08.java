import java.util.Scanner;

/**
 * 2. 等级分  A B C D ,也是通过三目运算写出结果，有兴趣的同学可以去试试（不推荐嵌套太多 太复杂 可读性太差）
 *    成绩 A:90-100 B:80-90 C:70-80 D:60-70
 */
public class CastTest08 {
    public static void main(String[] args) {
        System.out.println("============成绩等级============");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入成绩：");
            int score = scanner.nextInt();//接收键盘值
            System.out.println("你的成绩等级是："+((score>=90 && score<=100) ? "A" : (score<90 && score>=80) ? "B":(score<80 && score>=70) ? "C":(score<70 && score>=60) ? "D":"成绩不对！"));
        }
    }
}
