package org.cfx._02collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author RTX 9090
 */
public class _04Vector {
    public static void main(String[] args) {
        // 创建ArrayList对象
        ArrayList objects = new ArrayList();
        User user = new User();
        _01ArrayList arrayList = new _01ArrayList();
        user.setName("RTXxx","123456");
        // 添加元素
        objects.add(user);
        objects.add("1111");
        objects.add(223);
        objects.add('a');
        objects.add("何亮");
        // 插入元素
        objects.add(1,"09890");

        objects.set(3,2.3);



        System.out.println("===================普通for========================");

        for (int i = 0; i < objects.size(); i++) {
            System.out.println(objects.get(i));
        }

        System.out.println("====================增强for======================");

        for (Object obj:objects) {
            System.out.println(obj);
        }


        System.out.println("=======================迭代器1======================");

        Iterator iterator = objects.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        /*
            因为单项迭代器会把 指针移到最后
            所以第二个迭代器直接不走打印语句
            必须重写new 一个迭代器才可以
         */
        System.out.println("=======================迭代器2======================");
        Iterator iterator1 = objects.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        System.out.println("===========双向迭代器 向后迭代============");
        ListIterator listIterator = objects.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("==================双向-迭代器 向前迭代============================");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

    }
}
