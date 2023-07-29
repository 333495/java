package org.cfx._03set;

import org.cfx.Person;
import org.cfx.PersonComparator;
import org.cfx.User;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author RTX 9090
 * 排序
 */
public class TreeSetTest {
    public static void main(String[] args) {
         /*
            会进行排序
         */
        TreeSet objects = new TreeSet();
        objects.add(545646);
        objects.add(1);
        objects.add(89);
        objects.add(122);
        objects.add(54);
        System.out.println(objects);

        /*
            会进行排序 默认从小到大
         */
        TreeSet treeSet = new TreeSet();
        treeSet.add("W");
        treeSet.add("L");
        treeSet.add("C");
        treeSet.add("P");
        System.out.println(treeSet);

        System.out.println("===============单向迭代器=================");

        /*
            单向迭代器
         */
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("===============增强for=================");
        /*
            增强for循环
         */
        for (Object o : treeSet) {
            System.out.println(o);
        }

        System.out.println("===============forEach=================");
        /*
            forEach
         */
        treeSet.forEach(System.out::println);


        /*
            ClassCastException: class org.cfx.User2 cannot be cast to class java.lang.Comparable
            因为TreeSet 是排序的 但是我们给的User对象 是没有排序功能的
            方案一：自然排序 所以我要给User对象增加排序功能 Comparable接口 能排序的 实现 compareTo方法
         */
        System.out.println("================User排序================");
        Set treeSet2 = new TreeSet();
        treeSet2.add(new User("wu", 20));
        treeSet2.add(new User("li", 15));
        treeSet2.add(new User("chen", 23));
        treeSet2.add(new User("Hwang", 17));
        treeSet2.add(new User("huang", 15));

        System.out.println(treeSet2);


        System.out.println("================Person排序================");
        Set treeSet1 = new TreeSet(new PersonComparator());
        treeSet1.add(new Person("张三", 20));
        treeSet1.add(new Person("王五", 21));
        treeSet1.add(new Person("李四", 22));
        treeSet1.add(new Person("张麻子", 22));

        System.out.println(treeSet1);
    }
}
