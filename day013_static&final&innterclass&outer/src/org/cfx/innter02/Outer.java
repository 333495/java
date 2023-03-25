package org.cfx.innter02;

/**
 * @author RTX 9090
 */
public class Outer {

    /**
     * Inner是Outer内部类
     */
    class Inner{
        public void inner(){
            System.out.println("非静态内部类");
        }
    }
    /**
     *  可以被static修饰
     */
    static class StaticInner{
        public void staticInner(){
            System.out.println("静态内部类");
        }
    }
}

/**
 * 外部类
 */
class Outer1{
    public static void main(String[] args) {
        /**
         * 外部类调用 内部静态类需要 这样调用
         */
        Outer.StaticInner os = new Outer.StaticInner();
        os.staticInner();
        /**
         * 外部类调用 内部非静态类 需要这样调用
         */
        //外部类对象 再去调用 实例内部类的构造;
        Outer.Inner os2 = new Outer().new Inner();
        os2.inner();
    }
}