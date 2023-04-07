package org.cfx._02IntArray;

public class _01IntArrayTest {
    public static void main(String[] args) {

        _01IntArray intArray = new _01IntArray();

        System.out.println(intArray.getCapacity());
        System.out.println(intArray.getlength());
        intArray.add(1);
        intArray.add(2);
        System.out.println(intArray.getlength());


    }
}