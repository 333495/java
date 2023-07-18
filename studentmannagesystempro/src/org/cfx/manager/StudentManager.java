package org.cfx.manager;

import org.cfx.StudentManagerSystem;
import org.cfx.data.DataSource;
import org.cfx.entity.Student;

import java.util.Scanner;

/**
 * @author RTX 9090
 */
public class StudentManager {

    public static Scanner scanner = new Scanner(System.in);
    public static boolean gender;
    /**
     * 初始化学员数据
     */
    public static void init(){
        for (int i = 1; i < 5; i++) {
            //String stuId, String stuName, boolean gender, String stuTel, String address
            DataSource.students.put("001"+i,new Student("001"+i,"zs"+i, i % 2 == 0,"1311111111"+i,"二仙桥"+i));
        }
    }

//    public static void main(String[] args) {
//        init();
//        System.out.println(DataSource.students.values());
//    }

    /**
     * 查询所有学员信息
     */
    public void selectAll(){
        DataSource.students.values().forEach(System.out::println);
        StudentManagerSystem.menuManager.show();
    }

    /**
     * 查询指定学员
     */
    public void selectOne(){
        System.out.println("请输入学号：");
        String stuId = scanner.next();
        if (!DataSource.students.containsKey(stuId)){
            System.out.println("该学员不存在！");
            StudentManagerSystem.menuManager.show();
        }
        System.out.println(DataSource.students.get(stuId));
        StudentManagerSystem.menuManager.show();

    }

    /**
     * 增加学员信息
     */

    public void add(){
        System.out.println("请输入学号：");
        String stuId = scanner.next();
        if (DataSource.students.containsKey(stuId)){
            System.out.println("该学号已存在！");
            StudentManagerSystem.menuManager.show();
        }
        //String stuId, String stuName, boolean gender, String stuTel, String address
        input(stuId);
        StudentManagerSystem.studentManager.selectAll();
    }

    /**
     * 判断用户输入性别
     */
    private void setGender() {
        System.out.println("请输入性别(男或女)：");
        String inputGender = scanner.next();
        switch (inputGender){
            case "男":
                gender = true;
                break;
            case "女":
                gender = false;
                break;
            default:
                System.out.println("性别输入有误！请重新输入！");
                setGender();
                break;
        }
    }

    /**
     * 修改学员信息
     */
    public void update(){
        System.out.println("请输入学号：");
        String stuId = scanner.next();
        if (DataSource.students.containsKey(stuId)){
            input(stuId);
            selectAll();
        }else {
            System.out.println("输入有误，请重新输入！");
            StudentManagerSystem.menuManager.show();
        }
    }

    /**
     * 删除学员信息
     */
    public void delete(){
        System.out.println("请输入学号：");
        String stuId = scanner.next();
        if (DataSource.students.containsKey(stuId)){
            DataSource.students.remove(stuId);
            System.out.println("操作成功！");
            selectAll();
        }else {
            System.out.println("学号不存在！请重新输入！");
            StudentManagerSystem.menuManager.show();
        }
    }

    /**
     * 用户输入信息
     * @param stuId
     */
    public void input(String stuId) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String stuName = scanner.next();
        setGender();
        System.out.println("请输入电话：");
        String stuTel = scanner.next();
        System.out.println("请输入地址：");
        String address = scanner.next();
        DataSource.students.put(stuId,new Student(stuId,stuName,gender,stuTel,address));
        System.out.println("操作成功！");

    }
}
