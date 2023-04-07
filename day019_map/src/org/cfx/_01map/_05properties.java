package org.cfx._01map;

import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Properties;

/**
 * @author RTX 9090
 * Properties 无序 value可以重复 但是 key不行 且key和value都不可以为null 且线程安全
 *
 */
public class _05properties {
    public static void main(String[] args) throws Exception {

        // create a new HashMap
        Properties p = new Properties();


        /*
            不建议这样使用
         */
//        p.put("0","李白");
//        p.put("1", "床前明月光");
//        p.put("2", "疑是地上霜");
//        p.put("3", "举头望明月");
//        p.put("4", "低头思故乡");
//        System.out.println(p);
//        System.out.println("================get方法================");
//        System.out.println(p.get("0"));
//        System.out.println(p.get("1"));
//        System.out.println(p.get("1111111"));
//        System.out.println("=====================containsKey===========================");
//        System.out.println(p.containsKey("0"));
//        System.out.println(p.containsKey("1111111"));
//        System.out.println("======================containsValue=========================");
//        System.out.println(p.containsValue("李白"));
//        System.out.println("================remove================");
//        p.remove("1");
//        System.out.println(p);
//
//        // getOrDefault通过key获取value但是如果key值不存在就给一个默认的提示
//        System.out.println("=====================getOrDefault===========================");
//        System.out.println(p.getOrDefault("2", "不存在"));
//        System.out.println(p.getOrDefault("2222", "不存在"));

        p.setProperty("0","唐李白");
        System.out.println(p.getProperty("0"));

        FileInputStream fis = new FileInputStream("D:\\Desktop\\day019_map\\src\\org\\1.properties");
        p.load(fis);
        String Url = p.getProperty("jdbc.url");
        System.out.println(Url);

        System.out.println("================================================");
        PrintStream ps = new PrintStream("D:\\Desktop\\day019_map\\src\\org\\1.properties");
        // 输入到集合
        p.list(ps);
        System.out.println(p);
        //输出到磁盘
        p.setProperty("111","121231231");

        System.out.println(p.getProperty("111"));
    }
}
