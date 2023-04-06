package org.cfx.commonclass.date;

import java.util.Calendar;

/**
 * @author RTX 9090
 */
public class CalendarTest06 {
    public static void main(String[] args) {
        // 这是个抽象类，但提供了静态方法 得到子类对象
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        int minutes = calendar.get(Calendar.MINUTE);
        int seconds = calendar.get(Calendar.SECOND);
        System.out.printf("%d年%d月%d日%d时%d分%d秒%n", year, month, day, hours, minutes, seconds);

        System.out.println("======================");
        calendar.add(Calendar.HOUR_OF_DAY,+1);
        int hours1 = calendar.get(Calendar.HOUR_OF_DAY);
        calendar.add(Calendar.MONTH,+2);
        int month1 = calendar.get(Calendar.MONTH)+1;
        calendar.add(Calendar.MINUTE,+2);
        int minutes1 = calendar.get(Calendar.MINUTE);
        System.out.println(year+"年"+month1+"月"+day+"日"+hours1+"时"+minutes1+"分"+seconds+"秒");

    }
}
