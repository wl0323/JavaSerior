import java.util.concurrent.locks.ReentrantLock;

/**
 *
 *
 *
 *
 *
 * 面试题：synchronized 与lock的异同‘
 *    同：二者都可以解决线程安全问题
 *    异：synchronized机制在执行完相应的同步代码后，自动的释放同步监视器
 *       lock需要手动的启动同步(lock（）),同时结束同步也需要手动的实现（unlock（））
 *
 * 面试题：如何解决线程安全问题？有几种方式
 *
 *
 *建议使用顺序   lock--》同步代码块---》同步方法
 *
 *
 *
 * @author shkstart
 * @create 2022-05-05-14:32
 */
public class LockTest {
    public static void main(String[] args) {
        windows w1=new windows();
        Thread t1=new Thread(w1);
        Thread t2=new Thread(w1);
        Thread t3=new Thread(w1);
        Thread t4=new Thread();

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}
class windows implements Runnable{
    //1，实例化ReentrantLock

    private ReentrantLock lock =new ReentrantLock(true);



private  int tickte=100;
    @Override
    public void run() {
      while(true){
          try{
              //使用锁定方法的
              lock.lock();
              if (tickte > 0) {
                  try {
                      Thread.sleep(100);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  System.out.println(Thread.currentThread().getName() + "售票，票号为" + tickte);
                  tickte--;
              }else {
                  break;
              }
          }finally {
              lock.unlock();
          }


      }
    }



}