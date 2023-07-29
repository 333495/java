package org.cfx._02reflect;

import java.util.Objects;

/**
 * @author RTX 9090
 */
public class User {
    private String username;
    private String password;
    public String age;

    public User(String username, String password,String age) {
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public User() {
    }

    private void login(String username) {
        System.out.println("私有"+username);
    }
    public void login(String username, String password) {
        System.out.println("公有有参"+username+"+"+password);
    }
    private User(String username) {
        this.username = username;
        System.out.println("私有有参构造");
    }
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

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }
}
