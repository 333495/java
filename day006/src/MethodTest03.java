
import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字
 */
public class MethodTest03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(20);//生成随机数 [0-20）;
        System.out.println("=====================猜大小====================\n");
        System.out.println("请输入你觉得合适地数字：");
        int guessNum = scanner.nextInt();//获取用户输入的数字
        boolean flag = guess(guessNum,randomNum);// 接收第一次猜数字返回的 boolean类型值
        while (flag) {//当第一次没猜对  flag = true  自动进入循环
                System.out.println("请输入你觉得合适地数字：");
                guessNum = scanner.nextInt();
                flag = guess(guessNum,randomNum);//猜对了  flag = false  结束循环
        }
    }

    //猜数字的方法
    public static boolean guess(int num1, int num2){
        if (num1 > num2) {
            System.out.println("你输入的值大了！");
            return true;
        } else if (num1 < num2) {
            System.out.println("你输入的值小了！");
            return true;
        } else {
            System.out.println("恭喜你猜对了！");
            return false;
        }
    }
}
