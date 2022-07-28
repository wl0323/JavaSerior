/**
 * 生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处
 * 取走产品，店员一次只能持有固定数量的产品(比如:20），如果生产者试图
 * 生产更多的产品，店员会叫生产者停一下，如果店中有空位放产品了再通
 * 知生产者继续生产；如果店中没有产品了，店员会告诉消费者等一下，如
 * 果店中有产品了再通知消费者来取走产品。
 * 这里可能出现两个问题：
 * 生产者比消费者快时，消费者会漏掉一些数据没有取到。
 * 消费者比生产者快时，消费者会取相同的数据。
 *
 *
 * 分析
 * 1。是否是多线程问题？  是，生产者线程  消费者线程
 * 2.是否有共享数据 是：店员（产品）
 * 3.如何解决线程安全问题
 * 4.线程的通信
 * @author shkstart
 * @create 2022-05-05-15:57
 */
public class ProdactTest {
    public static void main(String[] args) {
        Cleck cleck=new Cleck();
        prodacer p1=new prodacer(cleck);

        p1.setName("生产者");
        p1.start();


        Consumer c1=new Consumer(cleck);

       c1.setName("消费者1");
        c1.start();
        Consumer c2=new Consumer(cleck);

        c2.setName("消费者2");
        c2.start();


    }
}
class Cleck{
  private  int productCount=0;
    public synchronized void produceProduct() {
        if(productCount<20){
            productCount++;
            System.out.println(Thread.currentThread().getName()+":开始生产第"+productCount+"个产品");
        notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void  consumProduct() {
        if(productCount>0){

            System.out.println(Thread.currentThread().getName()+":开始消费第"+productCount+"个产品");
            productCount--;
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class prodacer extends Thread{
private  Cleck cleck;
public  prodacer(Cleck cleck){
    this.cleck=cleck;
}
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始生产产品。。。。。。");
        while (true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cleck.produceProduct();
        }


    }


}
class Consumer extends Thread{
    private  Cleck cleck;
    public  Consumer(Cleck cleck){
        this.cleck=cleck;
    }
    @Override

        public void run() {
            System.out.println(Thread.currentThread().getName() + "开始消费产品。。。。。。");
            while (true){
                try {

                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cleck.consumProduct();
            }
    }
}
