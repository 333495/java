import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        /**
         * 1~100的和
         */
        int sum = 0;
        for (int i = 0; i < 101 ; i++) {
             //循环100次
            //把每次循环的i都相加
            sum+=i;
        }
        System.out.println(sum);
        System.out.println("===========================");

        /**
         * 100以内的素数
         */
        for (int l = 1; l <= 100; l++) {
            //循环100次
            //假设l是素数
            boolean suShu = true;
            for (int m = 2; m < l; m++) {
                if ( l % m == 0 ) {
                    suShu = false;
                    break;
                }
            }
            if (suShu){
                System.out.println(l);
            }
        }
        System.out.println("===========================");

        /**
         * 100以内的素数和
         */
        int sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            //循环100次
            //假设i是true
            boolean suShu = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    suShu = false;
                    break;
                }
            }
            if (suShu){
                sum1 += i;
            }
        }
        System.out.println(sum1);
        System.out.println("===========================");

        /**
         * 100以内的偶数
         */
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("===========================");

        /**
         * 100以内的偶数和
         */
        int sum2 = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                sum2+=i;
            }
        }
        System.out.println(sum2);
        System.out.println("===========================");

        /**
         * 九九乘法表
         */
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i +"\t");
            }
            System.out.println();
        }

    }
}
