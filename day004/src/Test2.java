/**
 * 10到30之间所有奇数的和（用for实现）
 */
public class Test2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 10; i <= 30; i++) {
            if (i % 2 != 0){
                sum = sum + i;
//                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
