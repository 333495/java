package org.cfx._02IntArray;

public class _02IntArray {
    /**
     * int数组
     */
    int[] values;
    /**
     * 下标
     */
    int index = 0;

    public _02IntArray(int capacity){
        values = new int[capacity];
    }

    /**
     * 初始化数组长度
     */
    public _02IntArray(){
        this(10);
    }
    public int getCapacity(){
        return values.length;
    }
    public int getIndex(){
        return index;
    }

    /**
     * 添加元素
     * @param a
     */
    public void add(int a){
        values[index] = a;
        index++;
    }
}
