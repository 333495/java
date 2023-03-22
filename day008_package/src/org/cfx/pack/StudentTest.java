package org.cfx.pack;
/*
    学生测试类
 */

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("张三");
        student.setStudentName("里斯");//也可以这样
        System.out.println(student.getpassWord());

        // this指代当前对象
        student.printThis1();
        student.printThis2();//打印出来都是一样的地址

    }
}