import java.util.Date;

/**
 *
 *   1问题：卖票过程中，出现了重票和错票------》出现了线程安全问题
 *   2原因：当某个线程操作车票的过程中，尚未完成操作的情况下，其他线程也进来了，操作卖票
 *   3.解决措施：当一个线程a再操作共享数据（票）的时侯，其他线程不能进来，直到线程操作完共享数据
 *              时，其他线程才可以开始操作共享数据，这种情况下即使线程a出现了杜塞，也不能改变
 *   4.再Java中，我们通过同步机制，来操作线程的安全问题
 *     方式一：同步代码块
 *      synchronized(同步监视器）{
 *          //需要被同步的代码
 *      }
 *      说明：操作共享数据的代码，即为需要被同步的代码
 *           共享数据：多个线程共同操作的变量，比如本例中的ticket
 *           同步监视器： 俗称锁，任何一个对象都可以作为锁
 *                     多个线程必须共一个锁
 *     方式二：同步方法
 *
 *   5.同步的方式，解决了线程的安全问题。
 *     操作
 * @author shkstart
 * @create 2022-05-01-16:44
 */
public class window1Test {
    public static void main(String[] args) {
        Window1 w1=new Window1();

        Thread t1=new Thread(w1);
        Thread t2=new Thread(w1);
        Thread t3=new Thread(w1);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();

        t2.start();
        t3.start();
    }

}
class Window1 implements Runnable{
    private int ticket=100;
    Object obj=new Object();
    @Override
    public void run() {
        while(true) {
             //synchronized(obj){
               synchronized (this){ //此时的this：唯一的winddow1的对象，
                 if (ticket > 0) {
                     try {
                         Thread.sleep(100);
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                     System.out.println(Thread.currentThread().getName() + ":" + "买票，票号为" + ticket);
                     ticket--;
                    }
                  else {
                     break;
                 }
             }

        }
    }


}
