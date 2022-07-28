/**
 * @author shkstart
 * @create 2022-05-01-16:26
 * 创建多线程的方式二：实现Runnable接口
 *
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        MyThread m1=new MyThread();
        Thread thread = new Thread(m1);
        thread.start();

        Thread thread1 = new Thread(m1);
        thread1.start();

    }

}
class MThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority()+":"+i);

        }
    }
}
