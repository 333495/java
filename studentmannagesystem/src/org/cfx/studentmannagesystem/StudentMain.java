package org.cfx.studentmannagesystem;

import org.cfx.studentmannagesystem.entity.Admin;
import org.cfx.studentmannagesystem.entity.Student;

import java.util.Scanner;

/**
 * 主函数
 */
public class StudentMain {
    static Admin[] admins = new Admin[3];
    static Student[] students = new Student[10];
    static Scanner scanner = new Scanner(System.in);
    static int stuNum = 4;

    public static void main(String[] args) {
        //初始化管理员账户信息
        initAdmin();
        //管理员登录信息判断，登录成功后才能执行下面的代码。
        login();
        //等登录成功后才会初始化学生信息
        initStudent();
        //调用菜单页面
        menu();
    }

    /**
     * 菜单界面
     */
    public static void menu(){
        System.out.println("1. 查询所有学员");
        System.out.println("2. 查询指定学员");
        System.out.println("3. 添加学员");
        System.out.println("4. 修改学员");
        System.out.println("5. 删除学员");
        System.out.println("6. 退出学员");
        System.out.println("请输入您要选择的菜单");
        //接收用户输入的菜单选项
        String choose = scanner.next();
        //判断用户输入的结果
        switch (choose){
            case "1":
                showAll();
                break;
            case "2":
                findOne();
                break;
            case "3":
                add();
                break;
            case "4":
                update();
                break;
            case "5":
                delete();
                break;
            case "6":
                System.exit(0);
                break;
            default:
                System.out.println("你输入的操作有问题！");
                menu();
        }
    }

    /**
     * 根据学号删除学生信息
     */
    private static void delete() {
        System.out.println("请输入学号：");
        String userId = scanner.next();
        boolean delete = false;
        for (int i = 0; i < stuNum; i++) {
            if (students[i].getStuId().equals(userId)){
                students[i] = null;
                delete = true;
            }
        }
        if (delete){
            System.out.println("删除成功！");
            showAll();
        }else {
            System.out.println("学号不存在！删除失败！");
            menu();
        }
    }

    /**
     * 根据学生id修改学生信息。
     */
    private static void update() {
        System.out.println("请输入学号：");
        String userId = scanner.next();
        for (int i = 0; i < stuNum; i++) {
            //判断用户输入的学号是否存在。
            if (students[i].getStuId().equals(userId)){
                System.out.println("请输入修改后的姓名：");
                String name = scanner.next();
                System.out.println("请输入性别：(true代表男，false代表女)");
                boolean gender = scanner.nextBoolean();
                System.out.println("请输入修改后的电话：");
                String tel = scanner.next();
                System.out.println("请输入修改后的地址：");
                String address = scanner.next();
                students[i] = new Student(userId,name, gender, tel, address);
                showAll();
            }
        }
        //遍历完也没有找到该学号，那就给提示，并返回主界面。
        System.out.println("学号不存在！\n");
        menu();
    }

    /**
     *添加学生信息
     */
    private static void add() {
        System.out.println("请输入学号：");
        String userId = scanner.next();
        boolean flag = true;
        //判断用户输入的学号是否存在
        for (int i = 0; i < stuNum; i++) {
            if (students[i].getStuId().equals(userId)){
                flag = false;
                break;
            }
        }
        //存在就可以添加
        if (flag) {
            System.out.println("请输入姓名：");
            String name = scanner.next();
            System.out.println("请输入性别：(true代表男，false代表女)");
            boolean gender = scanner.nextBoolean();
            System.out.println("请输入电话：");
            String tel = scanner.next();
            System.out.println("请输入地址：");
            String address = scanner.next();
            students[stuNum++] = new Student(userId,name, gender, tel, address);
            showAll();
        }else {
            //遍历完都不存在，那就给提示信息。
            System.out.println("你输入的学号存在！请重新输入！");
            add();
        }
    }

    /**
     * 查询指定学员
     */
    private static void findOne() {
        System.out.println("请输入学号：");
        String userId = scanner.next();
        boolean found = false;
        //判断用户输入的学号是否存在，存在就可以查询出
        for (int i = 0; i < stuNum; i++) {
            if (students[i].getStuId().equals(userId)){
                System.out.print("学号\t\t");
                System.out.print("姓名\t\t");
                System.out.print("性别\t\t");
                System.out.print("电话\t\t\t");
                System.out.println("地址");
                System.out.println("==================================================");
                System.out.print(students[i].getStuId()+"\t");
                System.out.print(students[i].getStuName()+"\t");
                System.out.print((students[i].isGender() ? "男" : "女")+"\t");
                System.out.print(students[i].getStuTel()+"\t\t");
                System.out.println(students[i].getAddress()+"\n");
                found = true;
            }
        }
        if (found) {
            System.out.println("查询成功！");
            menu();
        }else {
            //不存在就给提示。
            System.out.println("你输入的学号有误！请重新输入！");
            findOne();
        }


    }

    /**
     * 查询所有学员信息
     */
    private static void showAll() {
        System.out.print("学号\t\t");
        System.out.print("姓名\t\t");
        System.out.print("性别\t\t");
        System.out.print("电话\t\t\t");
        System.out.println("地址");
        System.out.println("==================================================");
        for (int i = 0; i < stuNum; i++) {
            if (students[i] != null) {
                System.out.print(students[i].getStuId()+"\t");
                System.out.print(students[i].getStuName()+"\t");
                System.out.print((students[i].isGender() ? "男" : "女")+"\t");
                System.out.print(students[i].getStuTel()+"\t\t");
                System.out.println(students[i].getAddress());
            }
        }

        menu();
    }

    /**
     * 登录功能
     */
    private static void login() {
        boolean result = true;
        do {
            System.out.println("请输入账号：");
            String userName = scanner.next();
            System.out.println("请输入密码：");
            String passWord = scanner.next();
            //校验信息
            for (int i = 0; i < admins.length; i++) {
                if (admins[i].getUsername().equals(userName) && admins[i].getPassword().equals(passWord)){
                    System.out.println("登录成功！");
                    //返回true
                    result = false;
                }
            }
            if (result) {
                System.out.println("账号或密码错误！请重新输入！");
            }
        } while (result);
        //false
    }

    /**
     * 初始化管理员数据
     */
    public static void initAdmin() {
        admins[0] = new Admin("1","1");
        admins[1] = new Admin("2","2");
        admins[2] = new Admin("3","3");
    }

    /**
     * 初始化学生数据
     */
    public static void initStudent() {
        for (int i = 0; i < stuNum; i++) {
            students[i] = new Student("110"+i,"LiSi"+i,true,"132323232"+i,"天赋"+i+"街");
        }
    }

}
