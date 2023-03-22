package org.cfx.pack;
/*
    学生类
 */
public class Student {
    //定义
    private String studentName;//学生姓名
    private String passWord;//学号

    public String getStudentName() {
        return studentName;
    }

    /*
        赋默认值  --  密码初始是 12345
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
        this.passWord = "123456";
    }
    /*
            也可以这样赋默认值  --  密码初始是 12345
     */
    public Student(String studentName){
        this.studentName = studentName;
        this.passWord = "123456";
    }

    public String getpassWord() {
        return passWord;
    }

    public void setpassWord(String studentNum) {
        this.passWord = studentNum;
    }

    public Student() {
    }

    public void printThis1() {
        System.out.println("this = " + this);
    }
    /*
        用this调用printThis1();
     */
    public void printThis2() {
        this.printThis1();//本类中构造方法之间的相互调用，但是必须是 构造方法内的第一句
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentNum='" + passWord + '\'' +
                '}';
    }
}
