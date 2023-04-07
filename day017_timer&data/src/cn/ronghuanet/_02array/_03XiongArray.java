package cn.ronghuanet._02array;

import java.util.Arrays;

public class _03XiongArray {
    // 存放任意数据类型的数据
    Object[] value;
    // 下标
    int index;

    public _03XiongArray() {
        this(5);
    }
    public _03XiongArray(int capacity) {
        value = new Object[capacity];
    }
    /**
     * 看容量
     */
    public int capacity(){
        return value.length;
    }
    /**
     * 看实际长度、
     */
    public int length(){
        return index;
    }
    /**
     * 添加方法
     */
    public int add(Object obj){
        // 自动扩容
        // 负载因子  就是扩容条件 0.75  假如 容量是100个 当实际装了75个 就扩容
        if (index >= value.length){
            // 创建新数组
            Object[] newArr = new Object[value.length*2+2];
            // 数据copy
            System.arraycopy(value,0,newArr,0,value.length);
            // 将value的地址值 指向新的数组空间
            value = newArr;
        }
        value[index] = obj;
        index++;
        return index-1;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < index; i++) {
           sb.append(value[i]).append(" ,");
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * 查询 - 根据下标查元素
     */
    public Object get(int index){
        // 判断下标合法性
        if (index < 0 || index >= this.index) {
            throw new ArrayIndexOutOfBoundsException("下标不合法哦~");
        }
        return value[index];
    }
    /**
     * 查询 - 根据元素 查下标
     */
    public int getIndex(Object obj){
        for (int i = 0; i < index; i++) {
           if(value[i] != null){
               if (value[i].equals(obj)){
                   return i;
               }
           }
        }
        return -1;
    }

    /**
     * 修改
     */
    public boolean update(int index,Object obj){
        // 判断下标合法性
        if (index < 0 || index >= this.index) {
            throw new ArrayIndexOutOfBoundsException("下标不合法哦~");
        }
        value[index] = obj;
        return true;
    }
    /**
     * 删除 - 根据下标删除
     */
    public void delete(int index){
        // 判断下标合法性
        if (index < 0 || index >= this.index) {
            throw new ArrayIndexOutOfBoundsException("下标不合法哦~");
        }
        value[index] = null;
    }
    /**
     * 删除 - 根据元素删除
     */
    public void delete(Object obj){
        int index = getIndex(obj);
        if (index == -1){
            throw new ArrayIndexOutOfBoundsException("元素不存在");
        }
        value[index] = null;
    }
}
