package org.cfx.static01;

/**
 * @author RTX 9090
 */
public class User {

    private static String username;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        User.username = username;
    }

    public User() {
    }

    public User(String username) {
        User.username = username;
    }

    @Override
    public String toString() {
        return "User2{"+username+"}";
    }
}
