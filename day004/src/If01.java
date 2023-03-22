import java.util.Scanner;

/**
 * if基本语法
 */
public class If01 {
    public static void main(String[] args) {
        /*
        先定义一个年龄 如果大于或等于18 就输入可以打游戏
                     否则就输出 不能玩游戏
         */

        int age = 0;
        /*
        if(判断条件){
             //判断条件可以是布尔值，也可以是结果为布尔值的 表达式
            //满足条件就可以执行
        }else{
            //不满足就执行这个语句
        }
         */
        if (age >= 18) {
            System.out.println("你可以玩游戏了");
        }else {
            System.out.println("你不能玩游戏");
        }

        for(int i = 1;i<=10;i+=2){
            System.out.println("i="+i);
        }

        for(int j = 1;j++<=10;j+=2){ //1(2) 4(5) 7(8) 10(11)
            System.out.println("j="+j);
        }
    }
}
