package org.cfx;

import java.util.Objects;

public class User implements Comparable{
    String name;
    Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + age + '\'' +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        User user = (User) o;
        if (this.age > user.age){
            return 1;
        }else if (this.age < user.age){
            return -1;
        }else {
            return this.name.compareTo(user.name);
        }
    }
}
