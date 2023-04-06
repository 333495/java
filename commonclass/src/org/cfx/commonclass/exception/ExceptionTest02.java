package org.cfx.commonclass.exception;

/**
 * @author RTX 9090
 */
public class ExceptionTest02 {
    public static void main(String[] args) {
        /*
            空指针异常，报了就去找对应的catch不会运行 int i = 9/0;
         */
        try {
            char[] c = null;
            System.out.println(c.length);
            int i = 9/0;
        }catch (ArithmeticException e) {
            System.out.println("算术异常囖");
        }catch (NullPointerException e) {
            System.out.println("空指针异常囖");
        }
        System.out.println("我没在try里面");
     }
}
