package org.cfx.manager;

import org.cfx.StudentManagerSystem;
import org.cfx.entity.Admin;

import java.util.Scanner;

/**
 * @author RTX 9090
 * 菜单
 */
public class MenuManager {
   public static Scanner scanner = new Scanner(System.in);

    //菜单
    public void show() {
        System.out.println("============欢迎使用本系统============");
        System.out.println("1、查询所有学员信息");
        System.out.println("2、查询指定学员信息");
        System.out.println("3、增加学员信息");
        System.out.println("4、修改学员信息");
        System.out.println("5、删除学员信息");
        System.out.println("6、退出系统");
        System.out.println("请输入编号：");
        String choose = scanner.next();
        switch (choose) {
            case "1":
                StudentManagerSystem.studentManager.selectAll();
                break;
            case "2":
                StudentManagerSystem.studentManager.selectOne();
                break;
            case "3":
                StudentManagerSystem.studentManager.add();
                break;
            case "4":
                StudentManagerSystem.studentManager.update();
                break;
            case "5":
                StudentManagerSystem.studentManager.delete();
                break;
            case "6":
                System.exit(0);
                break;
            default:
                System.out.println("输入有误，请重新输入！");
                show();
                break;
        }
    }
}
