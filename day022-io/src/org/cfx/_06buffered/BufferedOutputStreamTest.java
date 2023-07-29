package org.cfx._06buffered;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author RTX 9090
 *
 */
public class BufferedOutputStreamTest {
    public static void main(String[] args) {
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\4.txt"))){
            out.write("我是谁？".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
