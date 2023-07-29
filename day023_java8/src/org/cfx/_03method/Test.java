package org.cfx._03method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RTX 9090
 */
public class Test {
    public static void main(String[] args) {
        IPersonFactory factory = new IPersonFactory(){

            @Override
            public Person setPerson(String name, Integer age) {
                return new Person(name, age);
            }
        };
        System.out.println(factory.setPerson("John",20));

        //1.构造方法的引用
        //语法 类名::new
        //tips：
        //呗构造方法与函数式接口的抽象方法参数列表一致
        IPersonFactory ft = Person::new;
        System.out.println(ft.setPerson("John Simi",29));

        //2.静态方法引用
        //语法 类名::new
        //tips:
        //1被引用的静态方法参数列表和函数式接口中抽象方法一致。
        //2接口的抽象方法没有返回值，引用静态方法可以有返回值也可以没有
        //3接口的抽象方法有返回值，引用的静态方法必须有相同类型的返回值
        // 1-2 和 1-3
//        IParse p = new IParse(){
//
//            @Override
//            public Integer parse(String s) {
//                return Integer.parseInt(s);
//            }
//        };
//        System.out.println(p.parse("12121342"));

        IParse p = Integer::parseInt;
        System.out.println(p.parse("121342"));

//        3. 实例方法引用
//        语法 ： 对象名::非静态方法名
//        tips：
//        被引用的实例方法参数列表和函数式接口中抽象方法的参数一致！！
//        接口的抽象方法没有返回值，引用的实例方法可以有返回值也可以没有
//        接口的抽象方法有返回值，引用的实例方法必须有相同类型的返回值！！

//        IFilter filter = new IFilter(){
//            @Override
//            public boolean filter(String name) {
//                return name.endsWith(".txt");
//            }
//        };
//        System.out.println(filter.filter("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\数据.txt"));
        String filename = "我是撒比吗？";
        IFilter filter = filename::endsWith;
        System.out.println(filter.filter(filename));

        var str = "1111";
        var i = 111;
        var j = 'a';
        var k = new Object();

    }
}
