package org.cfx._02collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author RTX 9090
 */
public class ArrayListLoopTest02 {
    public static void main(String[] args) {
        ArrayList objects = new ArrayList();
        objects.add("111");
        objects.add("AI");
        objects.add(131);
        objects.add(121);
        objects.add(141);
        System.out.println(objects);

        System.out.println("================普通for=================");
        for (int i = 0; i < objects.size(); i++) {
            System.out.println(objects.get(i));
        }

        System.out.println("================增强for=================");
        for (Object o : objects) {
            System.out.println(o);
        }

        System.out.println("===========迭代器===========");
        Iterator iterator = objects.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("===========双向迭代器 - 向后迭代===========");
        ListIterator listIterator = objects.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("===========双向迭代器 - 向前迭代===========");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
