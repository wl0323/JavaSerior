/**
 * 多线程的创建：方式一：继承于Thread类
 *   1.创建一个继承于Thread类的子类
 *   2.重写Thread中的run（）----->将此线程执行的操作声明在此处
 *   3.创建Thread类的子类的对象
 *   4.通过此对象调用start（）
 *
 *
 * 例子：遍历100以内的所以的偶数
 *
 *
 * 注意：不能直接调用run()的方式启动线程
 *      2.一个线程只能启动一次，也就是说只能使用一次strat();我们需要重新创建一个线程的对象‘
 *
 *
 * @author shkstart
 * @create 2022-05-01-11:19
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.setName("线程一");
      myThread.start();//start的作用 ：1.启动当前线程，2.调用当前线程的run方法
          Thread.currentThread().setName("主线程");
            for (int i = 0; i <100 ; i++) {
                if(i%2==0){
                    System.out.println(Thread.currentThread().getName()+":"+i+"*****************");
                }
            }

    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
