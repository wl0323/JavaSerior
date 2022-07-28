/**
 * @author shkstart
 * @create 2022-07-06-14:02
 */
public class Site  implements  Runnable{
      private  int ticket=10;
      private  int setti=0;

    @Override
    public synchronized   void run() {

           while (true) {

                if (ticket < 1) {
                    return;
                }
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + "抢到第" + ++setti + "张票");
            }

    }
    public static void main(String[] args) {
        Site site=new Site();
        Thread t1=new Thread(site,"Tom");
        Thread t2=new Thread(site,"wl");
        Thread t3=new Thread(site,"黄牛");
        t1.start();
        t2.start();
    }
}
