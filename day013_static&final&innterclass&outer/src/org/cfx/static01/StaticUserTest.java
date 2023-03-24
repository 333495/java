package org.cfx.static01;

public class StaticUserTest {
    public static void main(String[] args) {
        StaticUser user = new StaticUser();
        user.setUsername("test");
        System.out.println(user.getUsername());
        user.setUsername("test1");
        System.out.println(user.getUsername());
    }
}