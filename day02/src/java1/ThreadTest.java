package java1;

/**
 * @author shkstart
 * @create 2022-05-03-17:42
 */
public class ThreadTest {
    public static void main(String[] args) {
       StringBuffer s1=new StringBuffer();


      new Thread(){
          @Override
          public void run() {
              super.run();
          }
      }.start();
    }


}
