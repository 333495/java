package org.cfx.studentmannagesystem.entity;

/**
 * 管理员类
 */
public class Admin {
    /*
        管理员账号
     */
    private String username;
    /*
        管理员密码
     */
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //无参
    public Admin() {
    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
