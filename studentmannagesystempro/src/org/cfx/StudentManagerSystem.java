package org.cfx;

import org.cfx.data.DataSource;
import org.cfx.manager.AdminManager;
import org.cfx.manager.MenuManager;
import org.cfx.manager.StudentManager;

import java.util.Scanner;

/**
 * @author RTX 9090
 */
public class StudentManagerSystem {
    /**
     * 静态代码，方便调用
     */
    public static AdminManager adminManager = new AdminManager();
    public static StudentManager studentManager = new StudentManager();
    public static MenuManager menuManager = new MenuManager();

    public static void main(String[] args) {
        //初始化管理员账号信息
        AdminManager.init();
        System.out.println("请输入账号：");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        System.out.println("请输入密码：");
        String password = scanner.next();
        //登录判断
        if (adminManager.login(username, password)){
            //登录成功，初始化学员信息
            StudentManager.init();
            StudentManagerSystem.menuManager.show();
        }else {
            System.out.println("你输入的账号或密码有误！");
        }
    }

}
