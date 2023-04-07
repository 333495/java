package org.cfx;

import java.util.Objects;

/**
 * @author RTX 9090
 */
public class User implements Comparable{
    String name;
    Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public User(String name) {
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
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
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
        User user = (User) o;
        if (this.age > user.age) {
            return 1;
        }else if (this.age < user.age) {
            return -1;
        }else {
            return this.name.compareTo(user.name);
        }
    }
}
