package org.cfx._01map;

import org.cfx.Dog;
import org.cfx.DogComparator;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author RTX 9090
 *
 * 排序了 -- 根据 key值排序 -- 不能空key 但是可以 空value
 */
public class TreeMapTest2 {
    public static void main(String[] args) {
        // create a new HashMap
        Map treeMap = new TreeMap();
        treeMap.put(1,4);
        treeMap.put(3,45);
        treeMap.put(2,13);
        treeMap.put(9,null);

        //不允许 key为空
        //treeMap.put(null,null);

        treeMap.put(4,1);
        treeMap.put(90,2);
        treeMap.put(24,3);
        System.out.println(treeMap);

        System.out.println("=======================根据key来排序=======================");

        TreeMap treeMap2 = new TreeMap();
        treeMap2.put(new User("as",20),1);
        treeMap2.put(new User("qq",22),1);
        treeMap2.put(new User("cmd",19),123);
        treeMap2.put(new User("opq",19),12);
        System.out.println(treeMap2);

        System.out.println("==============================================");

        TreeMap tree3 = new TreeMap(new DogComparator());
        tree3.put(new Dog("xx",18),1);
        tree3.put(new Dog("dem",21),1);
        tree3.put(new Dog("yas",21),1);
        tree3.put(new Dog("qqr",21),1);
        tree3.put(new Dog("kl",23),122);
        tree3.put(new Dog("6",18),122);
        System.out.println(tree3);

    }
}
