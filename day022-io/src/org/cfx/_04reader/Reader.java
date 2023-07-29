package org.cfx._04reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author RTX 9090
 *
 * 字符输入流
 */
public class Reader {
    public static void main(String[] args) {
        File file = new File("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\数据.txt");
        try (FileReader reader = new FileReader(file)) {
            // 字符个数
            int len;
//            //一个一个字符读
//            while ((len = reader.read()) != -1) {
//                System.out.print((char) len);
//            }

            //把读到的字符保存到char数组
            char[] buf = new char[10];
            while ((len = reader.read(buf)) != -1){
                System.out.print(new String(buf, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
