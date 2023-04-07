package org.cfx._03set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author RTX 9090
 */
public class HashSetLoopTest01 {
    public static void main(String[] args) {
        Set objects = new HashSet();
        objects.add("2313");
        objects.add("2111211");
        objects.add(1212);
        objects.add('点');
        objects.add(323.1111);

        /*
            无序
         */
        System.out.println(objects);

        System.out.println("---------------迭代器 -- 单向 -----------------");
        /*
            可以是用迭代器
         */
        Iterator iterator = objects.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /*
            forEach
         */
        objects.forEach(System.out::println);
    }
}
