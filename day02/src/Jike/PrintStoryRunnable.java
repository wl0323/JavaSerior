package Jike;

import static Jike.Test1.printSlowly;

public class PrintStoryRunnable implements Runnable {
    private final String text;
    private final long interval;

    public PrintStoryRunnable(String text, int interval) {
        this.text = text;
        this.interval = interval;
    }

    @Override
    public void run() {
        try {
            double num = Math.random();
            System.out.println("执行这段代码的线程名字叫做" + Thread.currentThread().getName());
            printSlowly(text, interval);
            System.out.println(Thread.currentThread().getName() + "执行结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
