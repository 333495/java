package org.cfx._03studentmanagementsystem.manager;

import org.cfx._03studentmanagementsystem.StudentMangeMenSystem;

import java.util.Scanner;

/**
 * @author RTX 9090
 */
public class MenuManager {
    Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("========================欢迎使用本系统========================");
        System.out.println("1. 查询所有学员");
        System.out.println("2. 查询指定学员");
        System.out.println("3. 添加学员");
        System.out.println("4. 修改学员");
        System.out.println("5. 删除学员");
        System.out.println("6. 退出系统");
        System.out.println("请输入您要选择的菜单");
        //接收用户输入的菜单选项
        String choose = scanner.next();
        //判断用户输入的结果
        switch (choose) {
            case "1":
                //1. 查询所有学员
                StudentMangeMenSystem.studentManager.FindAllStudent();
                break;
            case "2":
                //2. 查询指定学员
                StudentMangeMenSystem.studentManager.FindStudentById();
                break;
            case "3":
                //3. 添加学员
                StudentMangeMenSystem.studentManager.AddStudent();
                break;
            case "4":
                //4. 修改学员
                StudentMangeMenSystem.studentManager.updateStudent();
                break;
            case "5":
                //5. 删除学员
                StudentMangeMenSystem.studentManager.deleteStudent();
                break;
            case "6":
                //6. 退出学员
                System.out.println("欢迎下次使用！");
                System.exit(0);
                break;
            default:
                System.out.println("请重新输入编号");
                showMenu();
                break;
        }
    }
}
