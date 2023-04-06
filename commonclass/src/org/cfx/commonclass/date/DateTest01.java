package org.cfx.commonclass.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author RTX 9090
 */
public class DateTest01 {
    public static void main(String[] args) {

        System.out.println("================================================================");

        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();
        // 获取  年 月 日
        int day = date.getDate();
        int month = date.getMonth();
        int year = date.getYear()+1900;
        int seconds = date.getSeconds();
        int minutes = date.getMinutes();
        int hour = date.getHours();
        System.out.println(year+"年"+month+"月"+day+"日"+hour+"时"+minutes+"分"+seconds+"秒");

        Date date1 = new Date(time + 24 * 60 * 60 * 1000);
        // 获取  年 月 日
        int day1 = date1.getDate();
        int month1 = date1.getMonth();
        int year1 = date1.getYear()+1900;
        int seconds1 = date1.getSeconds();
        int minutes1 = date1.getMinutes();
        int hour1 = date1.getHours();
        System.out.println(year1+"年"+month1+"月"+day1+"日"+hour1+"时"+minutes1+"分"+seconds1+"秒");
        /*
         * 上面的方法已经被弃用了
         */


    }
}
