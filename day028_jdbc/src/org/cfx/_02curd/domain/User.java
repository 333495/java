package org.cfx._02curd.domain;

import lombok.*;

/**
 * @author RTX 9090
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long id;
    private String username;
    private int age;
    private int sex;
    private String password;

    public User(String username, int age, int sex, String password) {
        this.username = username;
        this.age = age;
        this.sex = sex;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "用户{" +
                "id=" + id +
                ", 账号=" + username +
                ", 年龄=" + age +
                ", 性别=" + (sex == 1 ? "男" : "女") +
                ", 密码=" + password +
                '}';
    }
}
