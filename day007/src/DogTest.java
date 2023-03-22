import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * 狗的测试类
 */
public class DogTest {
    public static void main(String[] args) {
        //一个名字 赋值为 苍苍，性别：母	吃：大香肠（用有参构造实现成员变量赋值），并且调用对象的吃方法
        Dog testDog = new Dog("苍苍",false);
//        System.out.println(testDog.dogName);
//        testDog.eat("大香肠");


        System.out.println("==================");
        //一个名字 赋值为 鹰鹰，性别：公	吃：大枣馒头（用对象名.成员变量的方式赋值给对应的成员变量），并且调用对象的吃方法
        Dog testDog2 = new Dog();
        testDog2.dogName = "鹰鹰";
//        System.out.println(testDog2.dogName);
        testDog2.dogSex = true;
//        System.out.println("一只叫" + testDog2.dogName + "的" + (testDog2.dogSex ? "公" : "母") + "狗");
        testDog2.eat1("大枣馒头");

        System.out.println("==================");
        // 3
        Dog testDog3 = new Dog("苍苍",false);
        testDog3.dogName = "鹰鹰";
        testDog3.dogSex = true;
        testDog3.eat1("大枣馒头");

        //   水仙花数 1
        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("请输入一个三位数的数字：");
//            int num = scanner.nextInt();
//            int bai = num / 100;//百位
//            int shi = num % 100 / 10;//十位
//            int ge = num % 10;//个位
//            int sum =bai*bai*bai + shi*shi*shi + ge*ge*ge;
//            if (sum == num){
//                System.out.println(sum+"是水仙花数");
//                return;
//            }else {
//                System.out.println("不是水仙花数");
//            }
//        }

        //   水仙花数 2
        boolean flag = true;
        do {
            System.out.println("请输入一个三位数的数字：");
            int num = scanner.nextInt();
            int bai = num / 100;//百位
            int shi = num % 100 / 10;//十位
            int ge = num % 10;//个位
            int sum =bai*bai*bai + shi*shi*shi + ge*ge*ge;
            if (sum == num){
                System.out.println(sum+"是水仙花数");
                flag = false;
            }else {
                System.out.println("不是水仙花数");
            }
        } while (flag);

    }
}