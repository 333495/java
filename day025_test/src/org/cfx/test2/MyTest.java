package org.cfx.test2;

/**
 * @author RTX 9090
 *
 * (1)	空指针异常：NullPointerException（1分）
 * (2)	数组下标越界异常：ArrayIndexOutOfBoundsException（1分）
 * (3)	字符串下标越界异常：StringIndexOutOfBoundsException（1分）
 * (4)	数学或运算异常：ArithmeticException（1分）
 * (5)	类型转换异常：ClassCastException（1分）
 */
public class MyTest {
    public static void main(String[] args) {
        /*
          空指针异常：NullPointerException（1分）
         */
//        String str = null;
//        System.out.println(str.toUpperCase());
        System.out.println("======================");
        /*
          数组下标越界异常：ArrayIndexOutOfBoundsException（1分）
         */
//        int[] a = {1,2,3,4};
//        System.out.println(a[8]);
        System.out.println("======================");
        /*
          字符串下标越界异常：StringIndexOutOfBoundsException（1分）
         */
//        String str = "abcd";
//        System.out.println(str.substring(0, 8));
        System.out.println("======================");
        /*
          数学或运算异常：ArithmeticException（1分）
         */
//        System.out.println(9/0);
        System.out.println("======================");
        /*
          类型转换异常：ClassCastException（1分）
         */
//        Animal a1 = new Animal();
//        Student s1 = (Student) a1;
//        System.out.println(s1);
    }
}
