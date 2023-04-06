package org.cfx.bigdecimal05;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class BigDecimal01 {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("89.23213231343534");
        BigDecimal b2 = new BigDecimal("7.232323212");
        System.out.println(b1);
        System.out.println(b2);
        // + - * /
        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.multiply(b2));
        System.out.println("=======================================");
        // ArithmeticException
        // 在做除法的时候 一定要约定 保留的位数 和 取整的方式
//        System.out.println(b1.divide(b2));
        System.out.println(b1.divide(b2, 150, RoundingMode.CEILING));


        int[] b11 = {1,2,3,4,2,6,6,8,7};
        bubbleSort(b11);



    }


    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
