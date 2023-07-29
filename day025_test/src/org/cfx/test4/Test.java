package org.cfx.test4;

import java.io.File;
import java.io.FileReader;

public class Test {
    public static void main(String[] args) throws Exception {
        File file = new File("H:\\Desktop\\1.txt");
        System.out.println(getStrTimes(file, "aa"));
    }
    public static int getStrTimes(File file, String str) throws Exception {
        FileReader fr = new FileReader(file);
        String s = "";
        int date;
        while ((date = fr.read()) != -1) {
            s += (char) date;//
        }
        char[] long1 = s.toCharArray();
        char[] short1 = str.toCharArray();
        int count = 0;
        if (long1.length > short1.length) {
            for (int i = 0; i < long1.length - short1.length ; i++) {
                String s2 = "";
                for (int j = 0; j < short1.length; j++) {
                    s2 += long1[i+j];
                }
                if (s2.equals(str)) {
                    count++;
                }
            }
        }
        // 返回出现的次数
        return count+1;
    }
}
