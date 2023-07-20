package org.cfx._01file;

import java.io.File;

/**
 * @author RTX 9090
 * 删除文件
 */
public class FileDelete {
    public static void main(String[] args) {
        System.out.println(delete(new File("H:\\Desktop\\Java6期\\2023-04-07_JAVA提升-文件(File)\\video")));
    }

    public static boolean delete(File file) {
        if (!file.exists()) {
            System.out.println("文件不存在！");
            return false;
        }
        if (file.isFile()){
            file.delete();
            return true;
        }else {
            File[] files = file.listFiles();
            for (File f : files){
                delete(f);
            }
            file.delete();
        }
        return true;
    }
}
