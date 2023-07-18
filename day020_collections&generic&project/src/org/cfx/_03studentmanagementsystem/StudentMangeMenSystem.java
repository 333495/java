package org.cfx._03studentmanagementsystem;

import org.cfx._03studentmanagementsystem.data.DataContext;
import org.cfx._03studentmanagementsystem.manager.AdminManager;
import org.cfx._03studentmanagementsystem.manager.MenuManager;
import org.cfx._03studentmanagementsystem.manager.StudentManager;

/**
 * @author RTX 9090
 */
public class StudentMangeMenSystem {
    /**
     * 抽取静态属性，因为全局都使用一个studentManager对象，不需要多次new
     */
    public static AdminManager adminManager = new AdminManager();
    public static StudentManager studentManager = new StudentManager();
    public static MenuManager menuManager  = new MenuManager();
    public static void main(String[] args) {
        //初始化管理员数据
        adminManager.inits();
        if (adminManager.login()) {
            System.out.println("登录成功！");
            // 初始化学生数据
            studentManager.inits();
            //显示菜单
            menuManager.showMenu();
        }else {
            System.out.println("登录失败！");
        }

//        adminManager.select();
    }
}
