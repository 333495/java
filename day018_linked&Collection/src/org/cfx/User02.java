package org.cfx;

import java.util.Objects;

/**
 * @author RTX 9090
 */
public class User02 implements Comparable{
    String name;
    Integer age;

    public User02() {
    }

    public User02(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public User02(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(String name,Integer age) {
        this.name = name;
        this.age = age;
    }

    public int getage() {
        return age;
    }

    public void setage(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User02)) {
            return false;
        }
        User02 user = (User02) o;
        return Objects.equals(name, user.name) && Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }

    /**
     int 0 表示2个元素 相等
     >0 表示升序
     <0 表示降序
     */
    @Override
    public int compareTo(Object o) {
        User02 user = (User02) o;
        if (this.age > user.age) {
            return 1;
        }else if (this.age < user.age) {
            return -1;
        }else {
            return this.name.compareTo(user.name);
        }
    }
}
