package org.cfx;

import java.util.Objects;

/**
 * @author RTX 9090
 */
public class Person02 implements Comparable {
    String name;
    Integer age;

    public Person02(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person02(String name) {
        this.name = name;
    }

    public Person02() {
    }

    @Override
    public String toString() {
        return "Person02{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Person02 person02)) {
            return false;
        }
        return Objects.equals(name, person02.name) && Objects.equals(age, person02.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    /**
     * 实现Comparable接口  重写CompareTo方法
     */
    @Override
    public int compareTo(Object o) {
        User2 user2 = (User2) o;
        if (user2.age > this.age) {
            return 1;
        }else if (user2.age < this.age) {
            return -1;
        }else if (user2.age.compareTo(this.age) > 0) {
            return 1;
        }
        return 0;
    }
}
