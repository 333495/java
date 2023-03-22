import java.util.Scanner;

/**
 * 使用switch
 * 11-1月  输出 冬天很冷
 * 2-4月 输出 春暖花开
 * 5-7月 输出 夏日炎炎
 * 8-10月 输出 秋风萧瑟
 * 如果输入其他月份 那就输出 请输入正确的月份
 */
public class Switch02 {
    public static void main(String[] args) {
        //创建对象
        Scanner scanner = new Scanner(System.in);
        //提示
        System.out.println("请输入月份：");
        String month = scanner.nextLine();
        switch (month){
            case "11" :
            case "12" :
            case "1" :
                System.out.println("冬天很冷");
                break;
            case "5" :
            case "6" :
            case "7" :
                System.out.println("夏日炎炎");
                break;
            case "2" :
            case "3" :
            case "4" :
                System.out.println("春暖花开");
                break;
            case "8" :
            case "9" :
            case "10" :
                System.out.println("秋风萧飒");
                break;
            default:
                System.out.println("请输入正确的月份！");
                break;
        }

    }
}
