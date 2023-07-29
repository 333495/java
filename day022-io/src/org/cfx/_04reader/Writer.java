package org.cfx._04reader;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author RTX 9090
 *
 * 字符输出流
 */
public class Writer {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\数据.txt")) {
            //往文件写入字符
            fw.write("test");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
