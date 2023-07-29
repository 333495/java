package org.cfx._02curd.test;

import org.cfx._02curd.domain.User;
import org.cfx._02curd.service.IUserService;
import org.cfx._02curd.service.Impl.UserServiceImpl;
import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class UserServiceImplTest {
    private static final IUserService userService = new UserServiceImpl();
    @Test
    public void insertUserTest() {
        User user = new User();
        user.setUsername("test");
        user.setAge(18);
        user.setSex(1);
        user.setPassword("test123");
        int i = userService.insertUser(user);
        if (i == 1) {
            System.out.println("User inserted successfully");
        }else {
            System.out.println("User not inserted successfully");
        }
    }

    @Test
    public void deleteUserTest(){
        int i = userService.deleteUser(1L);
        if (i != 0) {
            System.out.println("删除成功！");
        }else {
            System.out.println("删除失败！");
        }
    }

    @Test
    public void updateUserTest(){
        int test = userService.updateUser(123L, new User("test", 18, 1, "12345"));
        if (test != 0) {
            System.out.println("修改成功！");
        }else {
            System.out.println("修改失败！");
        }
    }

    @Test
    public void getUserById(){
        User userById = userService.getUserById(10L);
        if (userById != null){
            System.out.println("===========查询到了===========");
            System.out.println(userById);
        }else {
            System.out.println("==========查不到此人==========");
        }
    }
    @Test
    public void getAllUsers(){
        List<User> all = userService.getAll();
        if (all != null){
            System.out.println(all);
        }else {
            System.out.println("无人");
        }
    }

//    public static void main(String[] args) {
//        login();
//    }

    @Test
    public void login(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入账号：");
//        String username = scanner.next();
//        System.out.println("请输入密码：");
//        String password = scanner.next();

        String username = "test";
        String password = "1234";

        User userByName = userService.getUserByName(username);
//        System.out.println(userByName);
        if (userByName != null){
            if (userByName.getUsername().equals(username)){
                if (userByName.getPassword().equals(password)){
                    System.out.println("登录成功！");
                }else {
                    System.out.println("登录失败！");
                }
            }else {
                System.out.println("登录失败！");
            }
        }else {
            System.out.println("账号或密码错误！");
        }

//        System.out.println("select * from t_user where `name` = '"+username+"'");
    }
}