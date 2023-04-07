package org.cfx;

import java.util.Comparator;
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
        if (!(o instanceof Person02)) {
            return false;
        }
        Person02 person02 = (Person02) o;
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
        User user = (User) o;
        if (user.age > this.age) {
            return 1;
        }else if (user.age < this.age) {
            return -1;
        }else{
            return 0;
        }
    }
}
