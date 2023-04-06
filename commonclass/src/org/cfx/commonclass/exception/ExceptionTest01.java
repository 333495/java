package org.cfx.commonclass.exception;

/**
 * @author RTX 9090
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.hashCode());
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }catch (Exception e){
            System.out.println("发生异常了，快排查");
        } finally {
            System.out.println("我一定会被执行");
        }
        System.out.println("哈哈哈哈哈哈哈哈哈哈哈");

     }
}
