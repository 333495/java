package org.cfx._02output;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author RTX 9090
 * 字节输出流 FileOutputStream
 */
public class FileOutputStreamTest {
    public static void main(String[] args) {
        /*
            文件路径
         */
        File file = new File("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\数据.txt");
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            outputStream.write("Hello World".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //append属性 true表示拼接，不写表示覆盖。
        try (FileOutputStream outputStream = new FileOutputStream(file,true)) {
            outputStream.write("Hello World".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
