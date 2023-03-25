package org.cfx.static01;

/**
 * @author RTX 9090
 */
public class StaticUser {
    /**
     *  姓名
     */
    private static String username;


    public String getUsername() {
        return username;
    }

    public StaticUser(){}

    public StaticUser(String name){}

    public void setUsername(String username) {
        StaticUser.username = username;
    }

    @Override
    public String toString() {
        return "StaticUser{" +
                "username='" + username + '\'' +
                '}';
    }

    /**
     * 无参
     */
    public void eat(){
        System.out.println("吃吃吃");
    }
}
