import java.util.Scanner;

/**
 *switch选择结构
 */
public class Switch01 {
    public static void main(String[] args) {
        /*
            语法：
                switch(key){
                    case a:
                        //如果key和a相等 那么就执行代码1;
                        break;
                    case b:
                        //如果key和b相等 那么就执行代码2;
                        break;
                    case c:
                        //如果key和c相等 那么就执行代码c;
                        break;
                    ......
                    case n:
                    //如果key和n相等 那么就执行代码n;
                        break;
                    default:
                        代码default;
                        break;
                 }
         */

        /*
         * 如果是VIP1 就显示 您是尊贵的VIP1级会员
         * 如果是VIP2 就显示 您是尊贵的VIP2级会员，很牛皮
         * 如果是VIP3 就显示 您是尊贵的VIP3级会员，非常很牛皮
         * 如果是VIP4 就显示 您是尊贵的VIP4级会员，非常超级很牛皮
         * 如果是VIP5 就显示 您是尊贵的VIP5级会员，您就是皇帝
         * 如果是VIP6 就显示 您是尊贵的VIP6级会员，这是个超神！
         */
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您的VIP等级：");
            String numVip = scanner.nextLine();
            switch (numVip){
                case "1":
                    System.out.println("您是尊贵的VIP1级会员\n");
                case "2":
                    System.out.println("您是尊贵的VIP2级会员，很牛皮\n");
                    break;
                case "3":
                    System.out.println("您是尊贵的VIP3级会员，非常很牛皮\n");
                    break;
                case "4":
                    System.out.println("您是尊贵的VIP4级会员，非常超级很牛皮\n");
                    break;
                case "5":
                    System.out.println("您是尊贵的VIP5级会员，您就是皇帝\n");
                    break;
                case "6":
                    System.out.println("您是尊贵的VIP6级会员，这是个超神！\n");
                    break;
                default:
                    System.out.println("您是个煞笔，会员等级都不记得！\n");
                    break;
            }
        }
    }
}
