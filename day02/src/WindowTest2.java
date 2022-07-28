/**
 *
 *
 *使用同步代码块解决继承Thread类的方式的线程安全的问题
 *
 * @author shkstart
 * @create 2022-05-02-13:29
 */
public class WindowTest2 {
    public static void main(String[] args) {
        Window2 w1=new Window2();
        Window2 w2=new Window2();
        Window2 w3=new Window2();
        w1.setName("窗口一");
        w2.setName("窗口二");
        w3.setName("窗口三");
        w1.start();
        w2.start();
        w3.start();
    }


}
class Window2 extends Thread{
    private static   int ticket=100;
    static Object obj=new Object();
    @Override
    public void run() {

        while(true){
            synchronized (obj){
                if(ticket>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName()+""+"卖 票，票号为"+ticket);
                    ticket--;
                }else {
                    break;
                }
            }

        }
    }
}
