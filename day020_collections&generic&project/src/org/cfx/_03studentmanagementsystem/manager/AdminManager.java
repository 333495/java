package org.cfx._03studentmanagementsystem.manager;

import org.cfx._03studentmanagementsystem.data.DataContext;
import org.cfx._03studentmanagementsystem.entity.Admin;

import java.util.Scanner;

/**
 * @author RTX 9090
 */
public class AdminManager {
    /**
     * 初始化数据
     */
    public void inits() {
        DataContext.admins.put("1",new Admin("1","1"));
        DataContext.admins.put("cfx",new Admin("cfx","cfx"));
    }

    public boolean login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账号：");
        String username = scanner.next();
        System.out.println("请输入密码：");
        String password = scanner.next();
        if (!DataContext.admins.containsKey(username)){
            return false;
        }
        return DataContext.admins.get(username).getPassword().equals(password);
    }
}
