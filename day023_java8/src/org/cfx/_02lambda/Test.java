package org.cfx._02lambda;

import java.io.File;
import java.io.FileFilter;

/**
 * @author RTX 9090
 */
public class Test {
    public static void main(String[] args) {
        //匿名内部类
//        IAnimal myAnimal = new IAnimal(){
//
//            @Override
//            public void test01() {
//                System.out.println("name: 666");
//            }
//        };
//        myAnimal.test01();

        //lambda表达式  对函数式接口匿名内部类的简写
        /*
        *从=右边开始删除，删除到方法名
        * 入参（）和方法体{}之间用->连接 ->中间不能有空格
         */

        /* 1.方法体只有一句可以省略{}
         * 2.如果有返回值  可以省略return
         * 3.参数列表类型可以省略掉
         * 4.如果参数只有一个左边()小括号可以省略
         * /

//        IAnimal animal2 = () -> {
//            System.out.println("animal");
//        };
//        animal2.test01();

        //如果方法体中只有一句话，那么{}可以省略
//        IAnimal animal3 = s -> System.out.println("animal:"+s);
//        animal3.test01("🐖");

        //如果方法有一个入参，那么参数类型可以省略，入参()可以省略
//        IAnimal2 animal4 = i -> {
//            System.out.println("9819021"+i);
//        };
//        animal4.test02(9);

        //如果有多个入参，参数类型可以全部省略，入参的()必须有
//        IAnimal2 animal5 = (i, j) -> {
//            System.out.println("89812"+i+j);
//        };
//        animal5.test02(1,"90");

        /*
            如果有返回值，并且方法体只有一句代码，return可以省略，但是要和方法体的{}{一起省略。
         */
//        IAnimal2 animal6 = i -> i+1;
//        System.out.println(animal6.test02(1));

        IAnimal animal7 = (name,color) -> System.out.println(color+"色的"+name);
        animal7.test01("坤坤","黑白");

        FileFilter filter = filename -> filename.getName().endsWith("111");
        System.out.println(filter.accept(new File("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\拷贝.txt")));

        Runnable run = () -> System.out.println("开始了");
        run.run();

        System.out.println("===========================");
        // 会被final修饰
        int i= 10;
        IAnimal2 animal8 = a -> {
            System.out.println(i);
            return a+2;
        };
        System.out.println(animal8.test02(i));
    }
}
