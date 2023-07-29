package org.cfx._06buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author RTX 9090
 * 缓冲流 效率高
 */
public class BufferedInputStreamTest {
    public static void main(String[] args) {
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\2.txt"))){
            int len;
            // //先缓冲,再读取
            byte[] buf = new byte[1024];
            while ((len = in.read(buf)) != -1){
                System.out.println(new String(buf, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
