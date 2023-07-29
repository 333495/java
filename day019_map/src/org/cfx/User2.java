package org.cfx;

import java.util.Objects;

public class User2 implements Comparable{
    String name;
    Integer age;

    public User2(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User2(String name) {
        this.name = name;
    }

    public User2() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User2)) return false;
        User2 user2 = (User2) o;
        return Objects.equals(name, user2.name) && Objects.equals(age, user2.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                ", password='" + age + '\'' +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        User2 user2 = (User2) o;
        if (this.age > user2.age){
            return 1;
        }else if (this.age < user2.age){
            return -1;
        }else {
            return this.name.compareTo(user2.name);
        }
    }
}
