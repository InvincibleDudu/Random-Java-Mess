package test;

import util.DateUtil;

/**
 * Created by InvincibleDudu on 08/24/2020 at 15:45
 */
public class TestThread extends Thread {
    public static void main(String[] args) {
        System.out.println(DateUtil.getCurrentTimeMill());
        Thread t = new TestThread();
        t.start();
        System.out.println(DateUtil.getCurrentTimeMill());
    }

    @Override
    public void run() {
        System.out.println("In thread: " + DateUtil.getCurrentTimeMill());
    }
}

class RunnableThreadTest implements Runnable {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                RunnableThreadTest rtt = new RunnableThreadTest();
                new Thread(rtt, "新线程1").start();
                new Thread(rtt, "新线程2").start();
            }
        }

    }

    public void run() {
        int i;
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + DateUtil.getCurrentTimeMill() + " " + i);
        }
    }
}
