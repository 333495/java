/**
 * 1.求出10以内2的倍数的数字 和 个数。
 * 2.求出1-10以内的偶数。
 */
public class DoWhile02 {
    public static void main(String[] args) {

        //求出1-10以内的偶数。
        int n = 1;
        while (n<=10){
            if (n % 2 == 0){
                System.out.println(n);
            }
            n++;
        }

        //求出10以内2的倍数的数字 和 个数。
        int i = 0;
        int j = 0;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println(i);
                j++;
            }
            i++;
        }
        System.out.println("个数是："+j);


        System.out.println("===========1-10偶数和");
        int b = 1;
        int sum = 0;
        while (b<11){
            if (b % 2 == 0){
                sum += b;
            }
            b++;
        }
        System.out.println("和"+sum);
    }
}
