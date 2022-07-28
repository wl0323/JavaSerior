/**
 *
 *
 * Thread中常用方法
 * 1.start（）：启动当前线程，调用当前线程的run()
 * 2.run():通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
 * 3.currentThread():静态方法，返回执行当前代码的线程
 * 4.getName:获取当前线程的名字
 * 5.setName：设置当前线程的名字
 * 6.yield:释放当前cpu的执行权
 * 7.join:在线程a中调用线程b的join().此时线程a就进行堵塞状态，直到线程b完全执行完，线程a才结束堵塞状态
 * 8.stop:已过时，当执行此方法时，强制结束当前线程
 * 9。sheep:当前线程堵塞  毫秒
 * 10.isAlive();判断当前线程是否存活
 *
 * 线程优先级：
 * MAX_PRIORITY=10
 * MIN_PRIORITY=1
 * NORM_PRIORITY=5
 *2.如何设置和获取当前线程的优先级
 *     getpriority() 获取线程的优先级
 *     setpriority() 设置线程的优先级
 *
 *     说明：高优先级的线程要抢占低优先级cpu的执行权，
 *
 * @author shkstart
 * @create 2022-05-01-14:51
 */
public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread helloThread=new HelloThread("Thread:1");
        //给主线程命名
        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        //helloThread.setName("线程一");
        helloThread.setPriority(Thread.MAX_PRIORITY);
        helloThread.start();
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority()+":"+i);
//            if(i==20){
//                try {
//                    helloThread.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
        }
        System.out.println(helloThread.isAlive());

    }
}
class HelloThread extends Thread{
    public HelloThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            if(i%2==0){
//                try {
//                    sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority()+":"+i);
            }
//            if(i%20==0){
//                this.yield();
//            }
        }
    }
}
