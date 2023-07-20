package org.cfx._02output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author RTX 9090
 */
public class _01FileOutputStream {
    public static void main(String[] args) {
        /*
            写数据
         */
        try (FileOutputStream out = new FileOutputStream("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\数据.txt")) {
            String str = "中国最美乡村！";
            byte[] bs = str.getBytes();
            out.write(bs);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
            读数据
         */
        try (FileInputStream in = new FileInputStream("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\数据.txt")) {
            int len1;//读取的字节的个数
            //五个字节的数据,缓存在该数组的
            byte[] arr = new byte[1024];
            while ((len1 = in.read(arr)) != -1) {
                System.out.println(new String(arr, 0, len1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
