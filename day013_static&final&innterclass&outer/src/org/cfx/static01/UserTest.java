package org.cfx.static01;

/**
 * @author RTX 9090
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User("test");
        System.out.println(user);
        User user1 = new User("test1");
        User user2 = new User("test2");
        System.out.println(user1);
        System.out.println(user2);


        String s1 = "A" + "hello";

        System.out.println(s1);

        String s2 = "A";

        System.out.println(s2);

        String s3 = s2 + "hello";

        System.out.println(s3);

        String s4 = "A" + "hello";

        System.out.println(s4);
    }

}