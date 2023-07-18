package org.cfx.manager;

import org.cfx.data.DataSource;
import org.cfx.entity.Admin;

/**
 * @author RTX 9090
 */
public class AdminManager {
    /**
     * 初始化管理员信息
     */
    public static void  init() {
        DataSource.admins.put("admin",new Admin("admin","111"));
        DataSource.admins.put("superAdmin",new Admin("superAdmin","111"));
    }

//    public static void main(String[] args) {
//        init();
//        System.out.println(DataSource.admins.get("admin"));
//    }

    /**
     * 管理员登录
     * @param username
     * @param password
     * @return false表示失败  true表示成功
     */
    public boolean login(String username, String password){

        if (!DataSource.admins.containsKey(username)){
            return false;
        }

        return DataSource.admins.get(username).getPassword().equals(password);
    }
}
