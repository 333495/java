package org.cfx.commonclass.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author RTX 9090
 */
public class DateFormat04 {
    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        System.out.println(date);
        System.out.println("================================================");
        //格式化后
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(date));
        System.out.println(df.format(date).toString().concat("\t屎山代码"));

    }
}
