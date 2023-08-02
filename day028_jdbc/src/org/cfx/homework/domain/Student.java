package org.cfx.homework.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author RTX 9090
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private long id;
    private String username;
    private String password;
    private int age;
    private boolean sex;
    private String intro;

    public Student(String username, String password, int age, boolean sex, String intro) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.intro = intro;
    }

    @Override
    public String toString() {
        return "学生信息{" +
                "id=" + id +
                ", 账号=" + username +
                ", 密码=" + password +
                ", 年龄=" + age +
                ", 性别=" + (sex ? "男" : "女") +
                ", 自我介绍=" + intro +
                '}';
    }
}
