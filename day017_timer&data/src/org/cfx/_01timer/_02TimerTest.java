package org.cfx._01timer;

import java.util.Date;
import java.util.Timer;

public class _02TimerTest {
    public static void main(String[] args) {
        /**
         * 创建时间对象
         */
        Timer timer = new Timer();
        /**
         * 创建定时任务
         */
        TimerTask02 timerTask = new TimerTask02();

        // 1. 当前时间延迟两秒执行
        // void schedule(TimerTask task,Date date)
        Date date = new Date();
        long time = date.getTime() + 2000;
        Date date1 = new Date(time);
        //timer.schedule(timerTask,date1);

        // 2. 延迟执行
        // void schedule(TimerTask task,long delay)
        //timer.schedule(timerTask,5000);

        //  3.延迟执行，间隔多久
        // void schedule(TimerTask task,long delay,long period))
        //timer.schedule(timerTask,3000,2000);

        // 4. 设置定时任务 重复执行
        // void schedule(TimerTask task,Date firsTime,long period))
        timer.schedule(new TimerTask02(){
            @Override
            public void run() {
                System.out.println("起床了！！");
            }
        },new Date(time - 1000),1000);

    }
}
