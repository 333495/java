package org.cfx._01file;

import java.io.File;
import java.util.Objects;

/**
 * @author RTX 9090
 * 查找文件
 */
public class Find {
    public static void main(String[] args) {
        System.out.println(find(new File("C:\\Windows")));
    }

    public static boolean find(File file) {
        if (!file.exists()) {
            System.out.println("File does not exist");
            return false;
        }
        if (!file.isDirectory()) {
            System.out.println(file);
        }else {
            File[] files = file.listFiles();
            assert files != null;
            for (File child : files) {
                find(child);
            }
        }
            System.out.println(file);
        return true;
    }
}
