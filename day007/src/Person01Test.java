import static org.junit.Assert.*;

public class Person01Test {
    public static void main(String[] args) {
        //  创建对象
        Person01 person = new Person01();
        //赋值
        person.name = "John";
        person.gender = true;
        person.age = 22;
        person.address = "四川省成都市";

        //取值
        System.out.println("姓名："+ person.name);
        System.out.println(person.gender ? "男" : "女");
        System.out.println("年龄："+ person.age);
        System.out.println("地址："+ person.address);
        person.speak();
        person.eat("面包");

        String address = "11111";
        System.out.println(address.startsWith("1"));

        /**
         * 1. 构造方法的名字和类名完全一致（包括大小写完全一致）
         * 2. 没有返回值类型（void也不行）
         * 3. 构造方法方法体不能返回任何的值（即不能在方法体中return 值）
         * 4. 其他的和普通方法类似 ，可以有修饰符（public、protected、private、默认）,可以有形参列表
         * 5. 构造方法必须有方法体
         * 6. 构造方法不能有任何非访问性质的修饰符修饰，例如 static、final、synchronized、abstract等都不能修饰构造方法。
         *  注意：new Student() 这个整体既是一个Student对象，又是调用的Student的无参数构造方法
         */
    }
}