package org.cfx._01input;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author RTX 9090
 * 字节输入流 FileInputStream
 */
public class FileInputStreamTest {
    public static void main(String[] args) {
//        1．FileInputStream(File file) 	 表示从file指向的文件中读取
//        2．FileInputStream(String name) name表示文件的路径名(路径+文件名)

        try (FileInputStream in = new FileInputStream("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\数据.txt")) {
            //1024个字节的数据,缓存在该数组的
            byte[] arr = new byte[1024];
            //读取的字节的个数
            int len1;
            //循环读，直到读完
            while(   (len1 = in.read(arr))  !=  -1  ){
                System.out.println(  new String(arr,0,len1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
