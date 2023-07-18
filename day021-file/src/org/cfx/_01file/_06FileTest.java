package org.cfx._01file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 往文件写数据
 */
public class _06FileTest {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            File file = new File("H:\\Desktop\\Java6期\\2023-04-06_JAVA加强-项目实战-项目2-某高校学生管理系统(面向对象版)\\code\\数据.txt");
            fw = new FileWriter(file);
            fw.write("111111");
            fw.flush();
            System.out.println("写入成功！");
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fw != null){
                try {
                    fw.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        try {
            File file = new File("H:\\Desktop\\Java6期\\2023-04-06_JAVA加强-项目实战-项目2-某高校学生管理系统(面向对象版)\\code\\数据.txt");
            FileOutputStream fos = new FileOutputStream(file);
            String data = "这是一条测试数据";
            fos.write(data.getBytes());
            fos.flush();
            System.out.println("成功写入文件");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
