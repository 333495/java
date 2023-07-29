package org.cfx._06time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntUnaryOperator;

/**
 * @author RTX 9090
 */
public class TimeTest {
    public static void main(String[] args) {
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
//        Month month = localDate.getMonth();
//        System.out.println(month);


        //获取本地时间
        LocalDate date = LocalDate.now();
        System.out.println(date);

        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        int dayOfyear = date.getDayOfYear();
        int dayOfweek = date.getDayOfWeek().getValue();

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(dayOfweek);
        System.out.println(dayOfyear);

        System.out.println("==============================");

        LocalDate ld1 = date.withYear(2099);
        LocalDate ld2 = date.withMonth(12);

        System.out.println(ld1);
        System.out.println(ld2);

        System.out.println("判断两个日期对象是否相等");
        System.out.println(ld1.isEqual(ld2));
        System.out.println("判断谁在前，谁在后");
        System.out.println(ld1.isAfter(ld2));
        System.out.println(ld1.isBefore(ld2));

        System.out.println("===============日期的加减===============");
        System.out.println(ld1.plusMonths(2));
        System.out.println(ld2.plusDays(19));
        System.out.println(ld1.minusMonths(3));

        System.out.println("===============时间的加减===============");
        LocalTime l1 = LocalTime.now();
        System.out.println(l1.plusHours(2));
        System.out.println(l1.plusMinutes(3));

        System.out.println("========自定义========");
        LocalTime l2 = LocalTime.of(12,12,12);
        System.out.println(l2);

        System.out.println("========格式化时间=======");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(dateTimeFormatter.format(now));
        System.out.println(now.format(dateTimeFormatter));

        int[] arr = {100,98,78,22,67};
        int[] ints = Arrays.copyOfRange(arr, 2, 5);
        System.out.println(Arrays.toString(ints));

        int[] ints1 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(ints1));


    }
}
