package org.cfx.homework;

import java.util.Locale;

/**
 * Java的API中有如下设计好的类：
 *
 * String，请练习以下几个方法：
 */
public class StringTest {
    public static void main(String[] args) {
        //返回 3索引处的char字符。
        String test = "hello world";
        System.out.println("========charAt(int index)========");
        System.out.println(test.charAt(3));
        //判断字符串是否以  d结尾
        System.out.println("========boolean endsWith(String suffix)========");
        boolean flag = test.endsWith("d");
        System.out.println(flag);
        //判断字符串是否以  d开头
        System.out.println("========boolean startsWith(String prefix))========");
        boolean flag1 = test.endsWith("d");
        System.out.println(flag1);
        //判断字符串是否 为空
        System.out.println("========boolean isEmpty()========");
        boolean flag2 = test.isEmpty();
        System.out.println(flag2);
        //返回字符串的长度
        System.out.println("========int length()=========");
        System.out.println(test.length());
        //将此字符转换为全大写
        System.out.println("========String toUpperCase()========");
        System.out.println(test.toUpperCase(Locale.ROOT));
        //将此字符转换为全小写
        System.out.println("========String toLowerCase()========");
        System.out.println(test.toLowerCase(Locale.ROOT));
        //从索引2到索引5处，截取字符串
        System.out.println("========String substring(int beginIndex, int endIndex)========");
        System.out.println(test.substring(2,5));


    }
}
