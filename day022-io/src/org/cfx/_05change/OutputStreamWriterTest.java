package org.cfx._05change;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/**
 * @author RTX 9090
 * 输出交换流  需要设置以什么编码输出
 */
public class OutputStreamWriterTest {
    public static void main(String[] args) {
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\2.txt"), StandardCharsets.UTF_8)){
            writer.write("hello你好呀");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
