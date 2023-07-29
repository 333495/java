package org.cfx.homework;

import java.util.Objects;

/**
 * @author RTX 9090
 * User类
 */
@VIP
public class User {
    /**
     * 姓名
     */
    @VIP("9")
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 性别
     */
    public String sex;

    /**
     * 有、无参构造
     */
    public User() {
    }

    public User(String username, String password, String sex) {
        this.username = username;
        this.password = password;
        this.sex = sex;
    }

    /**
     * getter setter方法
     */
    @VIP
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 私有的登录方法
     */
    private void loginUser(String username){
        System.out.println("成功登录"+username);
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    /**
     * hashCode equals
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(sex, user.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, sex);
    }
}
