package org.cfx._01login.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author RTX 9090
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private long id;
    private String username;
    private int age;
    private int sex;
    private String password;
    private BigDecimal money;

    @Override
    public String toString() {
        return "用户{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", password='" + password + '\'' +
                ", money=" + money +
                '}';
    }

    public User(String username, int age, int sex, String password, BigDecimal money) {
        this.username = username;
        this.age = age;
        this.sex = sex;
        this.password = password;
        this.money = money;
    }
}
