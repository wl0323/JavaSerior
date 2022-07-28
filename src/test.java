/**
 * @author shkstart
 * @create 2022-05-03-16:27
 */
public class test {
    public static void main(String[] args) {
     C1 c1=new C1();
      c1.setName("线程一");
      c1.setPriority(Thread.MIN_PRIORITY);
     C2 c2=new C2();
     Thread t1=new Thread(c2);
     t1.setName("线程二");
     t1.setPriority(Thread.MAX_PRIORITY);
     c1.start();
     t1.start();

    }
}
class  C1 extends Thread{



    public void run() {
        for (int i = 1; i <100 ; i++) {
            if(i%2==1) {

                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
class C2 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <100 ; i++) {
            if(i%2==0)
                System.out.println(Thread.currentThread().getName()+":"+i);
        }

    }

}
