package org.cfx.commonclass.system;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author RTX 9090
 */
public class SystemTest01 {
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] targetArray = new int[sourceArray.length];

//        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);

        System.arraycopy(sourceArray, 0, targetArray, 0, 3);
        System.out.println(Arrays.toString(targetArray));

        //获取当前毫秒  1680077937240
        System.out.println(System.currentTimeMillis());

    }
}
