package com.cfx.Test;

import com.cfx.Student.Student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入id：");
        int id = scanner.nextInt();
        student.setId(id);
//        student.setId(123);
//        student.setName("坤坤");
//        StudentMapper student2 = new StudentMapper(321,"坤你太美");
        scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        System.out.println("======================");
        System.out.println("id是：" + id + "\t\n" + "姓名：" + name);
    }
}
