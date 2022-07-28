/**
 * @author shkstart
 * @create 2022-05-01-14:31
 */
public class Test {
    public static void main(String[] args) {
//        Even even=new Even();
//        even.start();
//        Singular singular=new Singular();
//        singular.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <100 ; i++) {
                    if(i%2==0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <100 ; i++) {
                    if(i%2==1){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();


    }
}
class Even extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <100 ; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
class Singular extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <100 ; i++) {
            if(i%2==1){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
