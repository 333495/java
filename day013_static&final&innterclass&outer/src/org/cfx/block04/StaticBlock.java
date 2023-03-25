package org.cfx.block04;

/**
 * @author RTX 9090
 */
public class StaticBlock {
//    主类的静态代码块 最先执行
    static {
    System.out.println("主类静态代码块执行了...");
    }

    public static void main(String[] args) {
//        其次是User对象的静态代码块
        User user = new User();
        user.setUsername("user");
//        最后是打印语句
        System.out.println(user);
    }
}
