package org.cfx._06buffered;

import java.io.*;

/**
 * @author RTX 9090
 */
public class CopyTest {
    public static void main(String[] args) {
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\3.txt"));BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\1.txt"))) {
            int len;
            byte[] bytes = new byte[1024];
            while ((len = in.read(bytes))!=-1){
                out.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
