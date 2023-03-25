package org.cfx.innter02;

/**
 * @author RTX 9090
 */
public class Inter01 {
    /**
     * static 修饰的成员变量 称为 类变量
     * 没有static 修饰的成员变量 称为 实例变量
     */
    static String name;

    /**
        内部类 inter
        可以 static可用修饰
     */
    static class Hip {

    }
}
/**
    外部类 outer
    static不能修饰
 */
class Kill {

}


