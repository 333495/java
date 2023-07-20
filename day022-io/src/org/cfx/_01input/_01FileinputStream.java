package org.cfx._01input;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author RTX 9090
 */
public class _01FileinputStream {
    public static void main(String[] args) throws IOException {
//        1．FileInputStream(File file) 	 表示从file指向的文件中读取
//        2．FileInputStream(String name) name表示文件的路径名(路径+文件名)

        File file = new File("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\数据.txt");
        try {
//            FileInputStream in = new FileInputStream(file);
            FileInputStream in = new FileInputStream("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\数据.txt");
            try {
//                int len;
//                while ((len = in.read()) != -1) {
//                    System.out.println((char) len);
//                }
                int len1;//读取的字节的个数
                byte[] arr = new byte[1024];//五个字节的数据,缓存在该数组的
                while(   (len1 = in.read(arr))  !=  -1  ){
                    System.out.println(  new String(arr,0,len1) );
                }
//                System.out.println(in.read());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
