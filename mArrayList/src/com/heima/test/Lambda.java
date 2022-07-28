package com.heima.test;

/**
 * @author shkstart
 * @create 2022-07-07-14:32
 */
public class Lambda {
    public static void main(String[] args) {
//       new Thread(new Runnable() {
//           @Override
//           public void run() {
//               System.out.println("线程开始了");
//           }
//       }).start();
//
//
//
//
//       new Thread(()->{
//           System.out.println("线程开始");
//       }).start();
     Eatable e=new E();
       EatableUse(e);


      new Eatable() {
           @Override
           public void eat() {
               System.out.println("吃涛子");
           }
       }.eat();

    EatableUse(()->{
          System.out.println("吃栗子");
      });







    }
    public static void  EatableUse( Eatable e){
        e.eat();

    }


}
interface Eatable{
    void eat();
}
class  E implements  Eatable{

    @Override
    public void eat() {
        System.out.println("吃苹果");
    }
}
