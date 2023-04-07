package org.cfx._03set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author RTX 9090
 * 有序
 */
public class LinkedHashSetTest02 {
    public static void main(String[] args) {
        Set linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(123);
        linkedHashSet.add(345);
        linkedHashSet.add(567);
        linkedHashSet.add(789);
        linkedHashSet.add(1);
        System.out.println(linkedHashSet);

        System.out.println("---------------迭代器 -- 单向 -----------------");
        /*
            可以是用迭代器
         */
        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /*
            forEach
         */
        linkedHashSet.forEach(System.out::println);
    }
}
