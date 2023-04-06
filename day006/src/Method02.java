import java.util.Random;
import java.util.Scanner;

/**
 * 值传递 引用传递
 */
public class Method02 {
    //基本数据不影响原来的值
    public static void main(String[] args) {
        int a = 6;
        System.out.println("改变前：" +a);//6
        change(a);
        System.out.println("改变后："+a);//6


        System.out.println("==========================================");


        int c = 10;
        System.out.println("改变前：" +c);//10
        change1(c);
        System.out.println("改变后：" + c);//10
    }

    public static void change(int a){
        a = 10;
        System.out.println("改变中：" +a);//10
    }

    public static void change1(int c){
        c = 1000;
        System.out.println("改变中：" + c);//1000
    }


}

class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int guess;

        while (true) {
            System.out.print("Guess a number between 1 and 100: ");
            guess = scanner.nextInt();

            if (guess == number) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            } else if (guess < number) {
                System.out.println("The number is lower.");
            } else {
                System.out.println("The number is higher.");
            }
        }
    }
}
