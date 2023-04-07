package org.cfx._01map;

import java.util.*;

/**
 * @author RTX 9090
 * HashMap 无序 value可以重复 但是 key不行 且key和value都可以为null 线程不安全的 速度很快
 */
public class _01HashMapTest {
    public static void main(String[] args) {

        // create a new HashMap
        Map hashMap = new HashMap();

        hashMap.put("0","李白");
        hashMap.put("1", "床前明月光");
        hashMap.put("2", "疑是地上霜");
        hashMap.put("3", "举头望明月");
        hashMap.put("4", "低头思故乡");
        System.out.println(hashMap);
        System.out.println("================get方法================");
        System.out.println(hashMap.get("0"));
        System.out.println(hashMap.get("1"));
        System.out.println(hashMap.get("1111111"));
        System.out.println("=====================containsKey===========================");
        System.out.println(hashMap.containsKey("0"));
        System.out.println(hashMap.containsKey("1111111"));
        System.out.println("======================containsValue=========================");
        System.out.println(hashMap.containsValue("李白"));
        System.out.println("================remove================");
        hashMap.remove("1");
        System.out.println(hashMap);

        // getOrDefault通过key获取value但是如果key值不存在就给一个默认的提示
        System.out.println("=====================getOrDefault===========================");
        System.out.println(hashMap.getOrDefault("2", "不存在"));
        System.out.println(hashMap.getOrDefault("2222", "不存在"));

    }
}
