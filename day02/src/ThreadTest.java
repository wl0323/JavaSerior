/**
 *
 * 死锁：1.不同的线程分别占用对方需要的同步资源不放弃，都在等待对方放弃
 *       自己需要的同步资源，就形成了线程的死锁
 *      2.说明，出现死锁后，不会出现异常，不会出现提示，只是所有的线程都处于
 *         阻塞状态，无法继续
 *      3。
 * @author shkstart
 * @create 2022-05-05-11:21
 */
public class ThreadTest {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer();

        StringBuffer s2=new StringBuffer();


        new Thread(){
            @Override
            public void run() {
               synchronized (s1){
                   s1.append("w");
                   s2.append("l");
                   try {
                       Thread.sleep(100);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   synchronized (s2){
                         s1.append("ang");
                         s2.append("ian");
                         System.out.println(s1);
                         System.out.println(s2);
                     }
               }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s2){
                    s1.append("w");
                    s2.append("l");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (s1){
                        s1.append("ang");
                        s2.append("ian");
                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }).start();
    }
}
