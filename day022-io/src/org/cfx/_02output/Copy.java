package org.cfx._02output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author RTX 9090
 * 拷贝文件
 */
public class Copy {
    public static void main(String[] args) {
        /*
        步骤  先获取输入流  再获取输出流
         */

        try (FileInputStream in = new FileInputStream("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\数据.txt"); FileOutputStream out = new FileOutputStream("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\拷贝.txt")) {
            // 一边读一边写
            //读取的字节的个数
            int len;
            //缓存在该数组
            byte[] bytes = new byte[1024];
            while ((len = in.read(bytes)) != -1){
                // 拷贝到另一个文件中
                out.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
