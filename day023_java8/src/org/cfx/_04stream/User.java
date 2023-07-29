package org.cfx._04stream;

import java.util.Comparator;
import java.util.Objects;


public class User implements Comparator<User> {
    String name;
    Integer score;

    public User(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public Integer getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compare(User o1, User o2) {
        return o1.getScore() - o2.getScore();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(score, user.score);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
