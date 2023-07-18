package org.cfx.entity;

import java.util.Objects;

/**
 * 学生类
 */
public class Student {
    /**
        学号
     */
    private String stuId;
    /**
        姓名
     */
    private String stuName;
    /**
        性别
     */
    private boolean gender;
    /*
        电话
     */
    private String stuTel;
    /*
        地址
     */
    private String address;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getStuTel() {
        return stuTel;
    }

    public void setStuTel(String stuTel) {
        this.stuTel = stuTel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(String stuId, String stuName, boolean gender, String stuTel, String address) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.gender = gender;
        this.stuTel = stuTel;
        this.address = address;
    }

    //无参
    public Student() {
    }

    @Override
    public String toString() {
        return "学生信息{" +
                "学号='" + stuId + '\'' +
                ", 姓名='" + stuName + '\'' +
                ", 性别=" + (gender?"男":"女")+
                ", 电话='" + stuTel + '\'' +
                ", 地址='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return gender == student.gender && Objects.equals(stuId, student.stuId) && Objects.equals(stuName, student.stuName) && Objects.equals(stuTel, student.stuTel) && Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuId, stuName, gender, stuTel, address);
    }
}
