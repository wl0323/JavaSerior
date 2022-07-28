package Window1;

/**
 * 创建多线程的方式二：实现Runnable接口
 * 1.创建一个实现Runnable接口的类
 * 2.实现类去实现Runnable中的抽象方法
 * 3.创建实现类的对象
 * 4.将此对象作为参数传递到Thread类的构造器中，创建Thread的对象
 * 5.通过Thread类的对象调用strat()
 *
 *
 * 比较两种线程创建方式
 *  开发中，优先选择：实现Runnable接口的方式
 *  原因
 *      1：实现的方式没有类的单继承性的局限性
 *      2实现的方式更适合来处理多个线程有共享数据的情况
 *  联系：thread也实现了Runnable接口
 *  相同点：两种方式都需要重写run(),
 *
 *
 *
 *
 *
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

    @Override
    public void run() {
        while(true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + ":" + "买票，票号为" + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}
