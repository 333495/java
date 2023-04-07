package cn.ronghuanet._02array;

import sun.security.util.Length;

/**
 * 存放数据
 *      add
 *      update
 *      delete
 *
 */
public class _01IntArray {
    // 自定义的数据类型 使用数组 作为数据存放的根本
    int[] value;
    // 申明一个下标
    int index = 0;

    public _01IntArray() {
        this(5);
    }

    public _01IntArray(int capacity) {
        value = new int[capacity];
    }

    /**
     * 获取容量的方法
     * @return
     */
    public int capacity() {
        return value.length;
    }

    /**
     * 添加数据的方法
     */
    public void add(int a){
        value[index] = a;
        index++;
    }
    /**
      */
    public int length(){
        return index;
    }
}
