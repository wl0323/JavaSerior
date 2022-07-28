package java1.java2;

/**
 *
 * 线程通信的例子,
 * 三个方法：
 * wait（）：一旦执行此方法，当前线程就进入堵塞状态，并释放同步检测器
 * notify（）：一旦执行此方法，就会唤醒被wait得一个线程，如果有多个线程被wait，就唤醒优先级高得
 *notifyAll（）；一旦执行此方法，就会所有唤醒被wait线程
 *说明：
 *     1.wait（）notify（）notifyAll（）这三个方法必须放在同步代码块或者同步方法中
 *     2.wait（）notify（）notifyAll（）这三个方法的调用者必须是同步代码块或者同步方法中的同步监视器
 *     3.wait（）notify（）notifyAll（）这三个方法是定义在java.lang.Object类中的
 *
 *
 *
 *     面试题：sleep（）与wait（）的异同
 *     同：一旦执行方法，都可以使得当前的线程进入堵塞状态
 *     不同：1声明的位置不同，Thread类中声明sleep（），Object类中声明wait（）
 *          2.调用的要求不同：sleep（）可以在任何需要的场景下使用，wait（）必须使用在同步代码块或者同步方法中
 *          3.关于是否释放监视器：如果两个方法都使用在同步代码块或者同步方法中，sleep（）不会释放锁，wait（）会释放锁
 *
 *
 *
 *
 *
 * @author shkstart
 * @create 2022-05-05-15:14
 */
public class CommunicationTest {
    public static void main(String[] args) {
        Number n1=new Number();
        Thread t1=new Thread(n1);
        Thread t2=new Thread(n1);
        t1.setName("线程1");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setName("线程2");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
class Number implements  Runnable{
private  int number=1;
Object obj=new Object();
    @Override
    public void run() {
        while (true){
            synchronized (obj){
                obj.notify();
                if(number<=100){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+":"+number);
                    number++;
                    try {
                        //使得调用如下wait（）方法得线程进入阻塞状态；
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    break;
                }
            }

        }
    }
}
