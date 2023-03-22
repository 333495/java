package org.cfx.studentmannagesystem.entity;

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
        return "Student{" +
                "stuId='" + stuId + '\'' +
                ", stuName='" + stuName + '\'' +
                ", gender=" + gender +
                ", stuTel='" + stuTel + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
