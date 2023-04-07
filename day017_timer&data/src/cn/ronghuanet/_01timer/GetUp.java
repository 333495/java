package cn.ronghuanet._01timer;

import java.util.TimerTask;

public class GetUp extends TimerTask {
    @Override
    public void run() {
        System.out.println("起床了 起床啦 你这个山猪......");
    }
}
