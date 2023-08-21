package org.cfx._01mapper.domain;

import java.util.Objects;

/**
 * @author RTX 9090
 */
public class Employee {
    private long id;
    private String name;
    private Integer age;
    private Integer sex;
    private String deptName;
    /**
     * 关联部门表部门id
     */
    private long deptId;

    public Employee(String name, Integer age, Integer sex, long deptId) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.deptId = deptId;
    }

    public Employee(long id, String name, Integer age, Integer sex, String deptName, long deptId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.deptName = deptName;
        this.deptId = deptId;
    }

    public Employee(long id, String name, Integer age, Integer sex, long deptId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.deptId = deptId;
    }

    public Employee() {
    }

    public Employee(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public long getDeptId() {
        return deptId;
    }

    public void setDeptId(long deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", deptName='" + deptName + '\'' +
                ", deptId=" + deptId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id && deptId == employee.deptId && Objects.equals(name, employee.name) && Objects.equals(age, employee.age) && Objects.equals(sex, employee.sex) && Objects.equals(deptName, employee.deptName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, sex, deptName, deptId);
    }
}
