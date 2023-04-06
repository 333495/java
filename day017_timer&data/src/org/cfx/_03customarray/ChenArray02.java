package org.cfx._03customarray;

import java.util.Arrays;

/**
 * @author RTX 9090
 */
public class ChenArray02 {
    /**
     * 定义Object数组
     */
    Object[] values;
    /**
     * 定义下标
     */
    int index = 0;


    public ChenArray02(int capacity) {
        values = new Object[capacity];
    }

    /**
     * 无参
     */
    public ChenArray02(){
        this(10);
    }
    /**
     *  查容量
     */
    public int getCapacity() {
        return values.length;
    }
    /**
     * 查实际容量
     */
    public int getIndex() {
        return index;
    }

    /**
     * 1. 添加元素 + 自动扩容
     */
    public void add(Object obj) {
        if (index >= values.length){
            Object[] newValues = new Object[values.length*2+2];
            System.arraycopy(values,0,newValues,0,values.length);
            values = newValues;
        }
        values[index] = obj;
        index++;
    }

    /**
     * 2. 根据下标查元素
     *
     */
    public Object selectById(int id) {
        if (id >= index || id < 0){
            throw new NotFound02Exception("出错啦，下标不合法！！！");
        }
        return values[id];
    }
    /**
     * 3. 根据元素查id
     *
     */
    public Object selectByName(Object obj) {
        for (int i = 0; i < index; i++) {
            if (values[i].equals(obj)){
                return i;
            }
        }
        return "没有找到";
    }

    /**
     * 4. 根据id修改元素
     *
     */
    public void updateById(int id , Object obj) {
        if (id >= index || id < 0){
            throw new NotFound02Exception("Not found");
        }
        values[id] = obj;
    }

    /**
     * 4. 根据元素删除元素
     *
     */
    public Object deleteByName(Object obj) {
        for (int i = 0; i < index; i++) {
            if (values[i].equals(obj) && values[i] != null){
                values[i] = null;
                index--;
                return "删除成功！";
            }
        }
        return "删除失败";
    }
    /**
     * 4. 根据id删除元素
     *
     */
    public Object deleteById(int id) {
        if (id >= index && id < 0){
            throw new NotFound02Exception("你输入的id不合理");
        }
        values[id] = null;
        index--;
        return "删除成功";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index; i++) {
            if (values[i] != null) {
                sb.append(values[i]);
                if (index - 1 != i) {
                    sb.append(" ,");
                }
            }
        }
        return "["+sb.toString()+"]";
    }
}
