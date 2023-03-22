package org.cfx.pack;


public class PackDemoTest {
    public static void main(String[] args) {
        PackDemo demo = new PackDemo();

        System.out.println("========封装前=========");
//        demo.name = "PackDemo";
//        demo.password = "password";

        // 封装后 所有原来通过对象名.属性的方式已经不行了
        //这样是为了 不在随意使用对象名.属性来修改和赋值。
        System.out.println("========封装后=========");
        demo.setName("PackDemo");
        demo.setPassword("password");

        System.out.println(demo.getName()+"\n"+demo.getPassword());
        /*
            使用封装后 就不能用 对象.属性的方式
            只能  通过   对象   调用  自己内部的方法，如果 方法 不存在则不能操作。
            1. private 只是标准的封装而已，可以有其他的封装
            2. get 和set方法都只能获取或者赋值一个成员变量
            不能setUserName(String u,String p){
                 userName = u;
                 passWord = p;
            }
         */
    }
}