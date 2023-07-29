package org.cfx._06buffered;

import java.io.*;

/**
 * @author RTX 9090
 */
public class BufferedReaderTest {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\数据.txt"))) {
            // 先缓冲,再读取
            int len;
            char[] buf = new char[1024];
            while ((len = reader.read(buf))!=-1){
                System.out.print(new String(buf, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
