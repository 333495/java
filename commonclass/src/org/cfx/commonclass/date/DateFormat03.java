package org.cfx.commonclass.date;

import java.text.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @author RTX 9090
 */
public class DateFormat03 {
    public static void main(String[] args) throws ParseException {

        /**
         * 格式化时间
         */
        Date date = new Date();
        System.out.println(date);
        System.out.println("================================================================");
        System.out.println(date.getTime());
        System.out.println("================================================================");
        // 用父类变量 装子类 对象
        DateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sf.format(date);
        System.out.println(format.concat("傻逼"));
        System.out.println(sf.parse("2023-03-29 17:05:21"));

    }
}
