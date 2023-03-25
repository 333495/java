package org.cfx.static01;

/**
 * @author RTX 9090
 */
public class StaticUserTest {
    public static void main(String[] args) {
        StaticUser user = new StaticUser("TEST");
        user.setUsername("test");
//        System.out.println(user.getUsername());
        user.setUsername("test1");
        System.out.println(user.getUsername());


        //standard's
        System.out.println("啊啊啊啊啊");
        user.eat();
    }
}