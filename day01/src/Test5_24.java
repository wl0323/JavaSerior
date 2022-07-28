/**
 * @author shkstart
 * @create 2022-05-24-20:09
 */
public class Test5_24 {
    public static void main(String[] args) {
        AA a1=new AA();
        a1.start();
        a1.setName("线程a");
        for (int i = 0; i <100 ; i++) {
            if(i%20==0){
                Thread.yield();
            }
            if(i%2==1){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }

        }

    }
}
class  AA extends  Thread{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            if(i%2==1){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
            if(i%20==0){
                Thread.yield();
            }
        }
    }
}
