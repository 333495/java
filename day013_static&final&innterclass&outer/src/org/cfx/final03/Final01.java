package org.cfx.final03;

/**
 * @author RTX 9090
 */
public class Final01 {

    /**
     *  final 修饰的实例变量必须要初始化
     */
    final String name = "";

    /**
     *  final 修饰的类变量必须要初始化
     */
    final static String EMPTY = "";

    /**
     *
     */
    public static final void eat(){
        System.out.println("吃吃吃");
        /*
            final 修饰的类变量不能被再分配值
         */
//        EMPTY = "1111";
    }
}
