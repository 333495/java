package org.cfx._01timer;

import java.util.Date;
import java.util.Timer;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author RTX 9090
 */
public class _01TimerTest {
    public static void main(String[] args) {
        // Timer() 创建一个新的计时器
        Timer timer = new Timer();
        //创建 计划任务
        TimerTask01 timerTask = new TimerTask01();
        // 1 . 设置定时任务
        // void schedule(TimerTask task, Date time)

        Date date = new Date();
        long time = date.getTime() + 2000;
        Date date1 = new Date(time);
        //timer.schedule(timerTask,date1);

        // 2 . 设置定时任务 重复执行
        // void schedule(TimerTask task, Date firstTime, long period)

//        timer.schedule(new TimerTask(){
//            @Override
//            public void run() {
//                System.out.println("你要去吃饭了");
//            }
//        },new Date(time - 1000),1000);

        //3 . 在指定的延迟之后安排指定的任务执行
        // void schedule(TimerTask task, long delay)

//        timer.schedule(new TimerTask(){
//            @Override
//            public void run() {
//                System.out.println("起床了 鸡 鸡 鸡");
//            }
//        },2000);

        // 4 . 在指定 的延迟之后开始 ，重新执行 固定延迟执行的指定任务。
        // void schedule(TimerTask task, long delay, long period)

        timer.schedule(new TimerTask01(){
            @Override
            public void run() {
                System.out.println("哈哈哈哈哈");
            }
        },2000,1000);




        int corePoolSize = 1;
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(corePoolSize);
        TimerTask01 task = new TimerTask01();
        executor.scheduleAtFixedRate(task, 0, 1, TimeUnit.SECONDS);


    }
}
