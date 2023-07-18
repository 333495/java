package org.cfx._03studentmanagementsystem.manager;

import org.cfx._03studentmanagementsystem.StudentMangeMenSystem;
import org.cfx._03studentmanagementsystem.data.DataContext;
import org.cfx._03studentmanagementsystem.entity.Student;

import java.util.Scanner;

/**
 * @author RTX 9090
 */
public class StudentManager {

    static Scanner scanner = new Scanner(System.in);

    /**
     * 初始化学生数据
     */

    public void inits() {
        for (int i = 0; i < 5; i++) {
            //Integer id, String name, Integer age, boolean gender
            DataContext.students.put(""+i,new Student(i,"小马"+i,20+i,i % 2 == 0));
        }
    }

    /**
     * 查询所有
     */
    public void findAllStudent() {
        DataContext.students.values().forEach(System.out::println);
        StudentMangeMenSystem.menuManager.showMenu();
    }

    /**
     * 根据ID查学生
     */
    public void findStudentById() {
        System.out.println("请输入学生ID：");
        String stuId = scanner.next();
        //System.out.println(DataContext.students.containsKey(stuId));
        if (!DataContext.students.containsKey(stuId)) {
            System.out.println("学号不存在！");
            StudentMangeMenSystem.menuManager.showMenu();
            return;
        }
        System.out.println(DataContext.students.get(stuId));
        StudentMangeMenSystem.menuManager.showMenu();
        scanner.close();
    }

    /**
     *  增加学员
     */
   public void addStudent() {
       System.out.println("请输入学生ID：");
       String stuId = scanner.next();
       if (DataContext.students.containsKey(stuId)) {
           System.out.println("学号已存在！");
           StudentMangeMenSystem.menuManager.showMenu();
           return;
       }
       stuAddOrUpdate(stuId);
       scanner.close();
   }

    //根据ID删除
    public void deleteStudent(){
        System.out.println("请输入要删除的学生ID：");
        String stuId = scanner.next();
        if (!DataContext.students.containsKey(stuId)) {
            System.out.println("学号不存在！");
            StudentMangeMenSystem.menuManager.showMenu();
            return;
        }
        DataContext.students.remove(stuId);
        System.out.println("删除成功！");
        findAllStudent();
        scanner.close();
    }

    //根据ID修改学员信息
    public void updateStudent(){
        System.out.println("请输入要修改的学生ID：");
        String stuId = scanner.next();
        if (!DataContext.students.containsKey(stuId)) {
            System.out.println("学号不存在！");
            StudentMangeMenSystem.menuManager.showMenu();
            return;
        }
        stuAddOrUpdate(stuId);
        scanner.close();
    }

    /**
     * 抽取方法
     */
    private void stuAddOrUpdate(String stuId) {
        System.out.println("请输入姓名：");
        String stuName = scanner.next();
        System.out.println("请输入年龄：");
        String stuAge = scanner.next();
        System.out.println("请输入性别：(男是true ，女是false)");
        String stuGender = scanner.next();
        DataContext.students.put(stuId,new Student(Integer.parseInt(stuId),stuName,Integer.parseInt(stuAge),Boolean.parseBoolean(stuGender)));
        System.out.println("操作成功！");
        findAllStudent();
        scanner.close();

    }
}
