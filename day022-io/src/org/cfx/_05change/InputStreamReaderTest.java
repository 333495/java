package org.cfx._05change;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author RTX 9090
 * 输入交换流 需要设置以什么编码输入
 */
public class InputStreamReaderTest {
    public static void main(String[] args) {
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\数据.txt"), StandardCharsets.UTF_8)) {
            int len;
            char[] buf = new char[1024];
            while ((len = reader.read(buf)) != -1) {
                System.out.println(new String(buf, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
