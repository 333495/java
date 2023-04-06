package org.cfx.commonclass.system;

import java.util.Arrays;

/**
 * @author RTX 9090
 */
public class SystemTest02 {
    public static void main(String[] args) {
        // 获取当前时间的毫秒数
        System.out.println(System.currentTimeMillis());

        // 复制数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = new int[13];
        System.arraycopy(arr,0,arr2,1,8);
        System.out.println(Arrays.toString(arr2));
    }
}
