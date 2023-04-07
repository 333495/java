package org.cfx._01map;

import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Properties;

public class _05properties2 {
    public static void main(String[] args) throws Exception {

        // create a new HashMap
        Properties p = new Properties();

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
    }
}
