package org.cfx.summarize.test1;

/**
 * @author RTX 9090
 *
 *
 */
public class Test01 {
    public static void main(String[] args) {
        /**
         * 1.求出10以内2的倍数的数字 和 个数。
         */
        int count = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("个数是："+count);


        /**
         * 2.求出 1-10的所有偶数的和
         */
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);


        /**
         * 3. 用for循环计算1-10的 积(即10的阶乘)1\*2\*3\*。。。10
         */

        int result = 1;
        for (int i = 1; i <= 10; i++) {
            result = result * i;
        }
        System.out.println(result);

        /**
         * 4. 用for循环计算1-10的  阶乘和
         */

        int result1 = 1;
        int count2 = 0;
        for (int i = 1; i <= 10; i++) {
            result = result * i;
            count2 += result1;
        }
        System.out.println(count2);
    }
}
