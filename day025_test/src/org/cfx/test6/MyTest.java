package org.cfx.test6;

import java.io.*;

/**
 * @author RTX 9090
 * 6，写一个方法传入一个File对象file和一个字符串str参数，
 * 统计这个字符串在这个文件中出现的次数（10分）（附加题)
 */
public class MyTest {
    public static void main(String[] args) throws Exception {

        File file = new File("H:\\Desktop\\1.txt");
        select(file,"aa");


    }
    public static void select(File file, String str) throws Exception {
        if (!file.exists()){
            System.out.println("File does not exist");
        }else {
            //使用BufferedReader读取字符串
            BufferedReader reader = new BufferedReader(new FileReader(file));
            //使用StringBuilder拼接字符串
            StringBuilder s = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null){
                s.append(line);
            }
//            System.out.println(str.length());
            int count = 0;
//            System.out.println(s.charAt(0));
            char[] chars = s.toString().toCharArray();
            if (s.length()>str.length()){}
            for (int i = 0; i < chars.length-1; i++) {
                if (chars[i] == str.charAt(0)){
                    if (chars[i+1] == str.charAt(1)){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
