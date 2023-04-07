package org.cfx._02generic;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author RTX 9090
 */
public class _02GenericMethod {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e", "f"};
        String[] arr2 = {"3", "1", "3", "2", "1", "a"};
        Integer[] arr3 = {3, 1, 3, 2, 1,};
        String[] arr4 = copyArray(arr,arr2);
        System.out.println(Arrays.toString(arr4));


    }
    public static <T> T[] copyArray(T[] t1,T[] t2) {
        // 泛型不能被实例化
        //T[] t3 = new T[t1.length + t2.length];

        T[] t3 = Arrays.copyOf(t1,t1.length + t2.length);
        /*
            因为 泛型不能new 所以我们使用了 Arrays.copyOf方法 去获取新数组
            把 t1的值 先赋值进去
         */
        System.arraycopy(t2, 0, t3, t1.length, t2.length);
        return t3;
    }
}
