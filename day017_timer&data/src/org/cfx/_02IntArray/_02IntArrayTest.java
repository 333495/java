package org.cfx._02IntArray;

public class _02IntArrayTest {
    public static void main(String[] args) {
        _02IntArray intArray = new _02IntArray();
        System.out.println(intArray.getCapacity());
        System.out.println(intArray.getIndex());
        System.out.println("=======================");

        /**
         * 开始添加元素
         */
        intArray.add(1);
        intArray.add(1);
        intArray.add(1);
        System.out.println(intArray.getCapacity());
        System.out.println(intArray.getIndex());


    }
}