/**
 * 用for循环计算1-10的 积(即10的阶乘)1*2*3*。。。10
 */
public class For01 {
    public static void main(String[] args) {
        int j = 1;
        for (int i = 1; i <= 10; i++) {
            j = j * i;
        }
        System.out.println(j);
    }
}
