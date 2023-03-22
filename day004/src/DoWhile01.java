/**
 * do while
 */
public class DoWhile01 {
    public static void main(String[] args) {
        //循环
        /*
            do{
                //循环体
            }while(判断条件);
         */
        int count = 1;
        do{
            count++;//放在前面不会打印第一次
            System.out.println("我爱java！");
            //count++;//放在后面会打印第一次
        }while (count <= 10);

        /*
            do while 和 while结构不一样
            区别在于 do while不管条件是否成立都会先执行一遍 再进行判断
                但是 while 会先判断 在执行循坏体
         */

        /*
            打印1到10之间的数字
         */
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while (i <= 10);
    }
}
