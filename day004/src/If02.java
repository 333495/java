import java.util.Scanner;

/**
 * 成绩分等级（if判断）
 */
public class If02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入分数：");
            int score = scanner.nextInt();
            if (score < 60 && score >0){
                System.out.println("E");
            }else if(score < 70  && score >= 60){
                System.out.println("D");
            }else if(score < 80 && score >= 70){
                System.out.println("C");
            }else if(score < 90 && score >= 80){
                System.out.println("B");
            }else if(score <= 100 && score >= 90){
                System.out.println("A");
            }else {
                System.out.println("分数不对，请你重新运行！");
                break;
            }
        }
    }
}
