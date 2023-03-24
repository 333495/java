package org.cfx.static01;

public class StaticUser {

    private static String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        StaticUser.username = username;
    }

    @Override
    public String toString() {
        return "StaticUser{" +
                "username='" + username + '\'' +
                '}';
    }
}
