package org.cfx._03set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author RTX 9090
 * LinkedHashSet 元素是不可重复的
 *        判断重复的原理是 ： equals + hashCode
 *        和HashSet不同  LinkedHashSet 是 有序的
 */
public class _01HashSetTest01 {
    public static void main(String[] args) {
        Set objects = new HashSet();
        objects.add("1211313");
        objects.add("21");
        objects.add(1);
        objects.add('p');
        objects.add(3.2);

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
