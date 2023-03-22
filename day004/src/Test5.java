/**
 * 求1-5的 的阶乘和(1!+2!+3!+4!+5!)（用for实现）
 * 1 + 2*1 + 3*2*1 + 4*3*2*1 + 5*4*3*2*1
 */
public class Test5 {
    public static void main(String[] args) {
        int sum = 1;
        int result = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum * i;//装乘积
            result = sum + result;//装和
        }
        System.out.println(result);//阶乘的结果
    }
}
