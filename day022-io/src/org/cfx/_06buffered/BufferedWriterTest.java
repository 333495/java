package org.cfx._06buffered;

import java.io.*;

/**
 * @author RTX 9090
 */
public class BufferedWriterTest {
    public static void main(String[] args) {
        try (BufferedWriter buff = new BufferedWriter(new FileWriter("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\7.txt"));) {
            buff.write("helloWorld",1,5);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
