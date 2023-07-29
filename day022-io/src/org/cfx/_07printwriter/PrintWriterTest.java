package org.cfx._07printwriter;

import java.io.*;

/**
 * @author RTX 9090
 *
 * 可以往窗口或者文件中输出东西
 */
public class PrintWriterTest {
    public static void main(String[] args) {
        PrintStream writer = new PrintStream(System.out);
        writer.println("22");
        try (PrintWriter w = new PrintWriter("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\6.txt")){
            w.write("Hello");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
