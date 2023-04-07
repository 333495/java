package org.cfx._01map;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author RTX 9090
 *
 * Hashtable 无序 value可以重复 但是 key不行 且key和value都不可以为null 且线程安全 但是速度慢
 */
public class _04Hashtable {
    public static void main(String[] args) {
        // create a new HashMap
        Map hashtable = new Hashtable();

        hashtable.put("0","李白");
        hashtable.put("1", "床前明月光");
        hashtable.put("2", "疑是地上霜");
        hashtable.put("3", "举头望明月");
        hashtable.put("4", "低头思故乡");
        System.out.println(hashtable);
        System.out.println("================get方法================");
        System.out.println(hashtable.get("0"));
        System.out.println(hashtable.get("1"));
        System.out.println(hashtable.get("1111111"));
        System.out.println("=====================containsKey===========================");
        System.out.println(hashtable.containsKey("0"));
        System.out.println(hashtable.containsKey("1111111"));
        System.out.println("======================containsValue=========================");
        System.out.println(hashtable.containsValue("李白"));
        System.out.println("================remove================");
        hashtable.remove("1");
        System.out.println(hashtable);

        // getOrDefault通过key获取value但是如果key值不存在就给一个默认的提示
        System.out.println("=====================getOrDefault===========================");
        System.out.println(hashtable.getOrDefault("2", "不存在"));
        System.out.println(hashtable.getOrDefault("2222", "不存在"));
    }
}
