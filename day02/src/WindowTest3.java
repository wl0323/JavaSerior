/**
 * @author shkstart
 * @create 2022-05-02-15:13
 */
public class WindowTest3 {
    public static void main(String[] args) {
        Window3 w1=new Window3();

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
class Window3 implements Runnable{
    private int ticket=100;
    Object obj=new Object();
    @Override
    public   void run() {
        while(true) {
              show();
        }
    }
    private synchronized void   show(){

        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + "买票，票号为" + ticket);
            ticket--;
        }

    }

}