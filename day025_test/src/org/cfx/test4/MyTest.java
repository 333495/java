package org.cfx.test4;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * @author RTX 9090
 * 4. 定义一个方法，查询指定文件夹下所有的avi文件（10分）
 */
public class MyTest {
    public static void main(String[] args) {
        find(new File("H:\\Desktop\\"));
    }

    public static void find(File file){
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".avi");
            }
        });
        assert list != null;
        for (String name : list) {
            System.out.println(name);
        }
    }
}
