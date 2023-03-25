package org.cfx.block04;

/**
 * @author RTX 9090
 */
public class StaticBlock2 {
    //最先执行
    static {
        System.out.println("StaticBlock2静态代码块执行了...");
    }

    public static void main(String[] args) {
        User2 user = new User2();
        user.name = "user2";
        System.out.println(user);
    }
}
