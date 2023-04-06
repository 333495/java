package org.cfx._02IntArray;

/**
 * 自定义int数组
 */
public class _01IntArray {

    /**
        存数据
     */
    int[] values;
    /**
        下标
     */
    int index = 0;

    public _01IntArray() {
        this(5);
    }

    public _01IntArray(int capacity) {
        values = new int[capacity];
    }

    /**
     * 查容量
     *
     */
    public int getCapacity(){
        return values.length;
    }

    /**
        查长度
     */
    public int getlength(){
        return index;
    }

    /**
     * 加元素
     * @param a
     */
    public int add(int a){
        values[index] = a;
        index++;
        return index-1;
    }

}
