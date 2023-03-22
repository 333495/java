package org.cfx.pack;


public class PackDemo {
    /*
        封装的步骤：（重点）
            1. 私有化 成员变量 -- （所有的成员变量 都需要用pravite）
            2. 必须提供getter setter 方法
            3. 提供对应的 公有 无参构造
            4. 建议类 是公共的。
     */
    private String name;
    private String password;
    /*
        当我们的属性 private后 私有化变量不能通过 对象名.属性名 直接赋值  取值
     */

    public PackDemo(String n, String p) {
        name = n;
        password = p;
    }

    //无参
    public PackDemo() {
    }

    //提供  getter(取值) setter（赋值） 方法
    //getter 需要有返回值
    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String p) {
        password = p;
    }
}

