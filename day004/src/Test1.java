/**
 * 求出20以内3的倍数的数字和个数。
 */

public class Test1 {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i <= 20; i++) {
            if (i % 3 == 0){
                System.out.println(i);
                j++;
            }
        }
        System.out.println("个数是：" + j);
    }
}
