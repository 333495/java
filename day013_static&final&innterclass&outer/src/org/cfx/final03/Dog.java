package org.cfx.final03;

/**
 * @author RTX 9090
 * final修饰的变量不能再被分配值
 * 修饰的方法也不能被重写
 */
public class Dog extends Animal{
    /**
     * 'run()' 无法重写 'org.cfx.final03.Animal' 中的 'run()'；重写的方法为 final
     */
//    public final void run(){
//        System.out.println(name + ": " + color + "跑");
//    }
    public static void main(String[] args) {
        Animal animal = new Animal();
//      无法将值赋给 final 变量 'name'
//        animal.name = "刷卡时达到";

    }
}
