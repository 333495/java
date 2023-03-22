package org.cfx.objecttest;

/**
 *   学生类
 */
public class Student {
    private String name;
    private String phoneNumber;
    int age;
    public Student() {
    }

    public Student(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 需求：希望打印对象的时候是内存地址中的内容  就需要重写当前Student类的toSting方法
     */
    @Override
    public String toString() {
        return "Student{" + name + "," + phoneNumber + "}";
    }

    /**
     * 比较引用类型一般用equals比较。 ==是比较的地址
     * this.name是String类型，比较String类型的值用String的equals方法
     */
    public boolean equals(Student stu) {
        //需求：两个学生，我们认为姓名和电话号码相同就是同一个人，就用重写学生类的equals方法
        //要比较两个引用类型的值，就用该引用类型的equals方法
        return this.name.equals(stu.name) && this.phoneNumber.equals(stu.phoneNumber);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (!(o instanceof Student)) {
//            return false;
//        }
//        Student student = (Student) o;
//        return age == student.age && Objects.equals(name, student.name) && Objects.equals(phoneNumber, student.phoneNumber);
//    }
}

