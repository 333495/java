package org.cfx._03set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author RTX 9090
 * 无序
 */
public class HashSetTest02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(123);
        hashSet.add(345);
        hashSet.add(567);
        hashSet.add(789);
        hashSet.add(1);
        System.out.println(hashSet);

        System.out.println("---------------迭代器 -- 单向 -----------------");
        /*
            可以是用迭代器
         */
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /*
            forEach
         */
        hashSet.forEach(System.out::println);
    }
}
