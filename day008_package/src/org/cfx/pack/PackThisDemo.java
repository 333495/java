package org.cfx.pack;

public class PackThisDemo {

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    /*
        this指代当前对象，即，哪个对象调用就指代哪个对象
        this表示的是当前对象，可看成this就是指代当前对象的地址
     */
    public void setName(String name) {
        this.name = name;//解决局部变量和成员变量的二义性
    }

    public String getPassword() {
        return password;
    }

    /*
        this的作用：
            1. 解决局部变量和成员变量的二义性 ---> get  set 方法以及有参构造
            2. 本类中构造方法之间的相互调用，但是必须是 构造方法内的第一句
            3. 作为返回值返回  ： this持有对象地址，表示该类的一个对象即是一个数据
            4. 作为参数传递.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "PackThisDemo{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    //无参
    public PackThisDemo() {
    }
    public void print() {
        System.out.println("this = " + this);
    }
}
