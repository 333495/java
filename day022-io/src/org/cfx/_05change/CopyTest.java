package org.cfx._05change;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author RTX 9090
 *
 */
public class CopyTest {
    public static void main(String[] args) {
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\数据.txt"), StandardCharsets.UTF_8); OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\3.txt"), StandardCharsets.UTF_8)) {
            int len;
            char[] chars = new char[11];
            while ((len = reader.read(chars)) != -1){
                writer.write(chars, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
