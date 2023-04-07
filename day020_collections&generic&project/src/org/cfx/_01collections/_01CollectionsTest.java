package org.cfx._01collections;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author RTX 9090
 */
public class _01CollectionsTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(12);
        list.add(1354);
        list.add(146);
        list.add(15);
        System.out.println(list);
        System.out.println("=======================使用=========================");
//        list.stream().max();
        /*
         * 找里面的最大值
         */
        //最大值
        Comparable max = Collections.max(list);
        System.out.println(max);
        //最小值
        Comparable min = Collections.min(list);
        System.out.println(min);
        //排序
        Collections.sort(list);
        System.out.println(list);



    }
}
