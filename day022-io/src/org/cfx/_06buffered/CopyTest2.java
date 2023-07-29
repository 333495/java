package org.cfx._06buffered;

import java.io.*;

/**
 * @author RTX 9090
 */
public class CopyTest2 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\拷贝.txt"));BufferedWriter writer = new BufferedWriter(new FileWriter("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\8.txt"))) {
            int len;
            char[] data = new char[1024];
            while ((len = reader.read(data))!=-1){
                writer.write(data, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
