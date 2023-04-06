package org.cfx._03customarray;

/**
 * 什么都能装
 *  Object
 * @author RTX 9090
 *
 */
public class ChenArray01 {
    /**
     * 创建Object数组
     */
    Object[] array;
    /**
     * 下标
     */
    int index = 0;

    public ChenArray01(int capacity) {
        array = new Object[capacity];
    }

    /**
     * 初始容量
     */
    public ChenArray01(){
        this(10);
    }

    /**
     * 获取下标（索引）
     */
    public int getIndex(){
        return index;
    }
    /**
     * 获取容量
     */
    public int getCapacity(){
        return array.length;
    }

    /**
     * 1. add 添加元素
     */
    public void add(Object o){
        if (index >= array.length || index < 0){
            //扩容机制  乘2加2
            Object[] newArray = new Object[array.length*2+2];
            System.arraycopy(array,0,newArray,0,array.length);
            array = newArray;
        }
        array[index] = o;
        index++;
    }

    /**
        1. 根据下标查元素
     */
    public Object selectById(int index){
        if (index >= this.index) {
            throw new NotFound01Exception("找不到下标！！！");
        }
        return array[index];
    }
    /**
        2. 根据元素查下标
     */
    public int selectByName(Object obj){
        for (int i = 0; i < index; i++) {
            if (array[i].equals(obj)){
                return i;
            }
        }
        return -1;
    }

    /**
     * 3 . 根据下标修改元素
     *
     */
    public void updateById(int index,Object obj){
        if (index >= this.index) {
            throw new NotFound01Exception("找不到下标！！！");
        }
            array[index] = obj;
    }

    /**
     * 4 .根据id删除元素
     *
     */
    public void deleteById(int index){
        if (index >= this.index) {
            throw new NotFound01Exception("找不到下标！！！");
        }
        array[index] = null;
    }

    /**
     * 5 .根据元素删除元素
     *
     */
    public int deleteByName(Object obj){
        for (int i = 0; i < index; i++) {
            if (array[i] != null && array[i].equals(obj)){
                array[i] = null;
                return 0;
            }
        }
        return -1;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index; i++) {
            if (array[i] != null){
                sb.append(array[i]);
                if (index - 1 != i){
                    sb.append(",");
                }
            }
        }
        return "["+ sb +"]";
    }
}
