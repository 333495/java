package org.cfx._02collection;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author RTX 9090
 */
public class _03LinkedList {
    public static void main(String[] args) {
        // 创建ArrayList对象
        ArrayList objects = new ArrayList();
        User user = new User();
        user.setName("RTXxx","123456");
        // 添加元素
        objects.add(user);
        objects.add("1111");
        objects.add(223);
        objects.add('a');
        objects.add("何亮");
        // 插入元素
        objects.add(1,"09890");

        objects.set(0,2.3);

        System.out.println(objects);

        System.out.println("===============增强for================");
        for (Object o : objects) {
            System.out.println(o);
        }
        /*
            只能单向迭代器
         */
        System.out.println("=============迭代器-单向============");
        ListIterator listIterator = objects.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
            listIterator.remove();
        }
        System.out.println(objects);
    }
}
