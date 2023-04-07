package cn.ronghuanet._02array;

public class _02IntArrayTest {
    public static void main(String[] args) {
        _01IntArray intArray = new _01IntArray();
        int capacity = intArray.capacity();
        System.out.println(capacity);
        System.out.println(intArray.length());
//        System.out.println(new _01IntArray(20).capacity());
        intArray.add(3);
        intArray.add(2);
        intArray.add(6);
        System.out.println(intArray.length());
//        intArray.add("ddd");
//        intArray.add(new User());
//        intArray.add(new Dog());

    }
}
