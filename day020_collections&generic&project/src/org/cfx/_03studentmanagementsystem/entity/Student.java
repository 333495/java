package org.cfx._03studentmanagementsystem.entity;

import java.util.Objects;

/**
 * @author RTX 9090
 */
public class Student {

    Integer id;
    String name;
    Integer age;
    boolean gender;

    public Student(Integer id, String name, Integer age, boolean gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return gender == student.gender && Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, gender);
    }

    @Override
    public String toString() {
        return "Student{" +
                "学号=" + id +
                ", 姓名='" + name + '\'' +
                ", 年龄=" + age +
                ", 性别=" + (gender?"男":"女") +
                '}';
    }
}
