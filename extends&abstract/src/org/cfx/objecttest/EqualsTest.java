package org.cfx.objecttest;

/**
 * @author RTX 9090
 * 1. hashCode方法
 * 2. toString
 * 3. equals
 * 4. Class getClass()
 */
public class EqualsTest {
    public static void main(String[] args) {

        Student stu1 = new Student("挂壁老哥", "696900");
        Student stu2 = new Student("挂壁老哥", "696900");

        //1. hashCode方法
        System.out.println("stu1的哈希值：" + stu1.hashCode());//1324119927
        System.out.println("stu2的哈希值：" + stu2.hashCode());//81628611

        //2. toString  打印对象是地址：特点（全限定包名+@+对象的哈希码的十六进制）
        //需求：希望打印对象的时候是内存地址中的内容
        System.out.println(stu1);//Student{挂壁老哥,696900}
        System.out.println(stu2);//Student{挂壁老哥,696900}

        //3. equals
        //需求：两个学生，我们认为姓名和电话号码相同就是同一个人，就用重写学生类的equals方法
        System.out.println(stu1.equals(stu2));//判断stu1对象是否和stu2对象相等。如果相等则是true，否则是false

        //4. Class getClass() 返回此 Object的运行时类，即当前对象所对应的字节码文件
        System.out.println(stu1.getClass());
    }
}
