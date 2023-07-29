package org.cfx._04stream;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author RTX 9090
 */
public class StreamTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
//        try {
//            System.setOut(new PrintStream("H:\\Desktop\\Java6期\\2023-07-20_JAVA提升-IO\\test\\数据.txt"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        //获取集合的数据流 foreach()
        System.out.println("======================打印流中的元素=======================");
        list.stream().forEach(System.out::println);

        // 操作流中的元素 map
        System.out.println("=================操作流中的元素=================");

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        // 元素*10
        numbers.stream().map( i -> i*10).forEach(System.out::println);

        // 过滤流中的元素 filter
        System.out.println("=================过滤流中的元素=================");
        numbers.stream().filter(integer -> integer > 3 ).forEach(System.out::println);

        // 截取流中的元素
        System.out.println("=================截取流中的元素=================");
        numbers.stream().limit(4).forEach(System.out::println);

        // 排序流中的元素
        System.out.println("=================排序流中的元素=================");
        numbers.stream().sorted().forEach(System.out::println);

        //需求：给前三名学生加10分
        System.out.println("=================排序学生的分数并加10分=================");
        List<User> users = new ArrayList<>();
        users.add(new User("John", 90));
        users.add(new User("kkw", 80));
        users.add(new User("xddsx", 80));
        users.add(new User("xhz", 60));
        users.add(new User("hh", 89));

        System.out.println(users);
        System.out.println("==================================");
        users.stream().sorted(Comparator.comparing(User::getScore).thenComparing(User::getName).reversed()).map(i -> i.getScore()+10).limit(3).forEach(System.out::println);

        System.out.println("==================================");

        //串行流
        users.stream().map(i -> i.getScore()+10).filter(i -> i > 60).limit(3).forEach(System.out::println);

        //并行流
        users.parallelStream().map(i -> i.getScore()+10).filter(i -> i > 60).limit(3).forEach(System.out::println);

        //规约操作
        List<User> collect = users.stream().filter(user -> user.getScore() > 60).collect(Collectors.toList());
//        System.out.println(collect.isEmpty());
        List<String> str = new ArrayList<>();
        str.add("John");
        str.add("xx");
        str.add("xx");
        str.add("xx");
        str.add("xx");

        String str1 = str.stream().limit(3).collect(Collectors.joining("jkadsdjkas"));

        System.out.println(str1);


    }
}
