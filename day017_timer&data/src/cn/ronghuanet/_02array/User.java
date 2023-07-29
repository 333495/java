package cn.ronghuanet._02array;

import java.util.Objects;

public class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
