/**
 *
 */
public class For03 {
    public static void main(String[] args) {
        /*
            for(初始条件A;判断条件B;循环后语句D){
                //循环体C
            }
         */
        //打印1-10
        int a = 0;
        while (a < 10){
            System.out.println(++a);
        }

        System.out.println("======================");

        for (int i = 1; i < 11; i++) {
            //循环体
            System.out.println(i);
        }
    }
}
