package cn.ronghuanet._01timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class _01TimerTest {
    public static void main(String[] args) {
        // 创建定时器对象
        Timer timer = new Timer();
        // 执行定时任务
        // void schedule(TimerTask task, Date time)
        // 在指定的时间做某事
        Date date = new Date();
        System.out.println("计时开始");
        long date1 = date.getTime() + 5000;

        Date date2 = new Date(date1);
        // 创建任务对象
        GetUp getUp = new GetUp();
        //timer.schedule(getUp,date2);
        // 按时睡觉？  schedule(TimerTask task, Date time)
        /*timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("睡觉啊....");
            }
        },new Date());*/

        // schedule(TimerTask task, Date firstTime, long period)
        /*timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("炸弹爆炸boom...");
            }
        },new Date(date1-2000),3000);*/

        // schedule(TimerTask task, long delay)
        /*timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("变成猪.....");
            }
        },4000);*/

        // schedule(TimerTask task, long delay, long period)
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("变成猪.....");
            }
        },4000,1000);
    }
}
