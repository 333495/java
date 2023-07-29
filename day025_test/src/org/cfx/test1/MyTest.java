package org.cfx.test1;

import java.io.*;

/**
 * @author RTX 9090
 * 1. 请用IO流完成文件hehe.avi的拷贝，
 * 原地址(E:\hehe.avi)，复制到桌面(C:\Users\Administrator\Desktop\hehe.avi)（10分）
 */
public class MyTest {
    public static void main(String[] args) {
        File file = new File("E:\\hehe.avi");
        File file2 = new File("C:\\Users\\Administrator\\Desktop\\hehe.avi");
        try (InputStream in = new FileInputStream(file);OutputStream out = new FileOutputStream(file2)){
            int read = in.read();
            out.write(read);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
