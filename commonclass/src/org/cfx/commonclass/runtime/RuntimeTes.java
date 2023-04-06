package org.cfx.commonclass.runtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author RTX 9090
 */
public class RuntimeTes {
        public static void main(String[] args) throws Exception {
        // 获取当前进程
        Process process = Runtime.getRuntime().exec("cmd /c start cmd.exe /K ping www.baidu.com");

        // 等待进程执行完成
        int exitCode = process.waitFor();

        // 输出进程的退出码
        System.out.println("进程的退出码是：" + exitCode);

    }
}
