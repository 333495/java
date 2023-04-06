package org.cfx.commonclass.date;

import java.util.Date;

/**
 * @author RTX 9090
 */
public class DateTest02 {
    public static void main(String[] args) {
        Date date = new Date();
        /*
            下面方法已被弃用
         */
        int day = date.getDate();
        int month = date.getMonth()+1;
        int hours = date.getHours();
        int minutes = date.getMinutes();
        int seconds = date.getSeconds();
        int year = date.getYear()+1900;
        System.out.println(year+"年"+month+"月"+day+"日"+hours+"时"+minutes+"分"+seconds+"秒");
        System.out.println("================================================");

        System.out.println(date.getTime());
        long dateTime = date.getTime();
        Date date1 = new Date(dateTime+24*60*60*1000);
        int day1 = date1.getDate();
        int month1 = date1.getMonth()+1;
        int hours1 = date1.getHours();
        int minutes1 = date1.getMinutes();
        int seconds1 = date1.getSeconds();
        int year1 = date1.getYear()+1900;
        System.out.println(year1+"年"+month1+"月"+day1+"日"+hours1+"时"+minutes1+"分"+seconds1+"秒");

        /*
         * 上面的方法已经被弃用了
         */
    }
}
