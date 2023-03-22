package org.cfx.pack;


public class PackThisDemoTest {
    public static void main(String[] args) {
        PackThisDemo demo = new PackThisDemo();
        demo.setName("何亮");
        demo.setPassword("12345");
        System.out.println(demo.getName() +"\n"+ demo.getPassword());

        // 打印出来都是同一个
        System.out.println(demo);
        demo.print();
    }
}