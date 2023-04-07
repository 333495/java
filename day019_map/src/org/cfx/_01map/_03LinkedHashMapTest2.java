package org.cfx._01map;

import java.util.*;
import java.util.Map.Entry;

/**
 * @author RTX 9090
 * LinkedHashMap 和 HashMap 的区别
 *     一个有序    一个无序
 *
 * LinkedHashMap 有序 value可以重复 但是 key不行 且key和value都可以为null 线程不安全的
 */
public class _03LinkedHashMapTest2 {
    public static void main(String[] args) {
        // create a new linkedHashMap   父类变量 接 子类对象
        Map linkedHashMap = new LinkedHashMap();

        /*
          1、 Object **put(Object key,Object value);**  如果当前添加的这个key已经存在了，会覆盖这个键之前的值，返回的是之前的value值

          2、 boolean **containsKey(Object key)**  判断Map集合中是否包含当前的传入的key

          3、 boolean **containsValue(Object value)**  判断Map集合中是否包含当前的传入的value

          4、 **Object get(Object key) ;**   根据指定的键key找到对应的值，如果没有找到返回 null

          5、 **remove(Object key)**  ;   删除指定key对应的那一对
         */

        linkedHashMap.put("0","李白");
        linkedHashMap.put("1", "床前明月光");
        linkedHashMap.put("2", "疑是地上霜");
        linkedHashMap.put("3", "举头望明月");
        linkedHashMap.put("4", "低头思故乡");
        System.out.println(linkedHashMap);
        System.out.println("================get方法================");
        System.out.println(linkedHashMap.get("0"));
        System.out.println(linkedHashMap.get("1"));
        System.out.println(linkedHashMap.get("1111111"));
        System.out.println("=====================containsKey===========================");
        System.out.println(linkedHashMap.containsKey("0"));
        System.out.println(linkedHashMap.containsKey("1111111"));
        System.out.println("======================containsValue=========================");
        System.out.println(linkedHashMap.containsValue("李白"));
        System.out.println("================remove================");
        linkedHashMap.remove("1");
        System.out.println(linkedHashMap);

        // getOrDefault通过key获取value但是如果key值不存在就给一个默认的提示
        System.out.println("=====================getOrDefault===========================");
        System.out.println(linkedHashMap.getOrDefault("2", "不存在"));
        System.out.println(linkedHashMap.getOrDefault("2222", "不存在"));
        /*
          6、 Collection  values()  返回一个Map中的所有的value值 Collection集合

          7、 Set keySet()   返回所有的key值的集合（key是唯一的，所以返回的是Set集合）

          8、 Set entrySet()  返回所有的entry对象（key是唯一的，所以返回的是Set集合）
         */
        System.out.println("=====================values===========================");
        System.out.println(linkedHashMap.values());
        Collection values = linkedHashMap.values();
        System.out.println("===========================values的迭代器=========================");
        Iterator iterator = values.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("====================values的增强for====================");
        for (Object obj: values) {
            System.out.println(obj);
        }

        System.out.println("=====================keySet===========================");
        System.out.println(linkedHashMap.keySet());
        Set set = linkedHashMap.keySet();
        System.out.println("=======================keySet的迭代器=========================");
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println("====================keySet的增强for====================");
        for (Object obj : set) {
            System.out.println(obj);
        }
        System.out.println("=====================entrySet===========================");
        System.out.println(linkedHashMap.entrySet());

        Set set1 = linkedHashMap.entrySet();
        System.out.println("=========================entrySet的增强for=======================");
        /*
            需要强转 父类调不了 子类方法，需要向下造型。
         */
        for (Object entry : set1) {
            Entry entry1 = (Entry)entry;
            System.out.println(entry1.getKey()+"::"+entry1.getValue());
        }

        System.out.println("=========================entrySet的迭代器=======================");
        Iterator iterator2 = set1.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());;
        }
    }
}
