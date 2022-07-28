package Jike;

import static Jike.Test1.printSlowly;

/**
 * @author shkstart
 * @create 2022-05-05-11:09
 */
public class Test1 {
        private static final String TEXT = "太阳在这个平静的小村庄缓缓升起，又是开始了平常的一天。我们故事的主人公睡眼惺忪的起来\n" +
                "......";

        public void main(String[] args) {
            System.out.println("程序开始，执行的线程名字叫做" + Thread.currentThread().getName());

            for (int i = 1; i <= 3; i++) {

                Thread thread = new Thread(new PrintStoryRunnable(TEXT, 200 * i), "我的线程：" + i);
                thread.start();
            }
            System.out.println("启动线程结束，名字叫做" + Thread.currentThread().getName());

        }



        public static void printSlowly(String text, long interval) throws InterruptedException {
            for (char ch : text.toCharArray()) {
                Thread.sleep(interval);
                System.out.print(ch);
            }
            System.out.println();
        }

}
