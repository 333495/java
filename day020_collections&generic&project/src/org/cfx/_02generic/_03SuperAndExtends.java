package org.cfx._02generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author RTX 9090
 */
public class _03SuperAndExtends {
    public static void main(String[] args) {
        ArrayList<A> a = new ArrayList<A>();
        ArrayList<B> b = new ArrayList<B>();
        ArrayList<C> c = new ArrayList<C>();
        ArrayList<D> d = new ArrayList<D>();
        ArrayList<E> e = new ArrayList<E>();

        /**
         * 下限
         */
        test(a);
        test(b);
        test(c);
//        test(d);
//        test(e);

        /**
         * 上限
         */
//        test1(a);
//        test1(b);
        test1(c);
        test1(d);
        test1(e);


    }

    /**
     * test1 只能接口 C 和 C 的父类
     */

    public static void test(List<? super C> list) {
    }

    public static void test1(List<? extends C> list) {
    }
}

class A {}
class B extends A{}
class C extends B{}
class D extends C{}
class E extends D{}
