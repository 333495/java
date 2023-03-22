/**
 * 逻辑运算
 * 1. &  ：两边都为true ，结果为true
 * 2. |  ：只要有一边为true，结果为true
 * 3. &&（双与） ：两边都为true ，结果为true
 * 4. ||（双||）  :  只要有一边为true，结果为true
 * 5. ^  :  两边不一样，结果为true ，否则为false
 * 6. ！ ： 逻辑非
 */
public class Cast06 {
    public static void main(String[] args) {
        //找一个数 小于10 大于3 3 < x < 10
        int x = 50;
        System.out.println( x>3 & x<10 );// & 需要两边都为true最后结果才是true

        //找一个数小于3 大于10
        System.out.println ( x<3 | x>10 );// | 表示或者，两边有一个为true，结果就为true

        //&& ||
        System.out.println(x > 3 && x < 10);
        System.out.println(x<3 || x > 10);

        //&和&&的区别
        int a =5;
        System.out.println(false & a++ > 3);
        System.out.println(false && a++ > 3);

        /*
        &和&&判断一样
        但&&拥有短路 前面为false 就不会执行后面的语句
         */

        //||
        int b = 6;
        System.out.println(true | --b > 4);

        int b1 =6;
        System.out.println(true || --b1 > 4);
        /*
        |与||判断条件一样
        但是||拥有短路，如果||前面是true就不会执行后面的操作
         */

        //^
        System.out.println(true ^ true);//两边一样就为false

        //! 逻辑非表示取反
        System.out.println(!(3 > 2));//如果结果为true取反就为false。
    }
}
