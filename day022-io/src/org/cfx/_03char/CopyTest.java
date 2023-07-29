package org.cfx._03char;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author RTX 9090
 *
 * 字符流
 *
 * 包含中文的文档用字符流，英文、视频等文档用字节。
 */
public class CopyTest {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\数据.txt");
             FileWriter fw = new FileWriter("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\拷贝.txt")) {
            char[] data = new char[1024];
            int len;
            while ((len = reader.read(data)) != -1){
                fw.write(data,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
