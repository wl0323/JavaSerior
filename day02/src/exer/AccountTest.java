package exer;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * 银行有一个账户。
 * 有两个储户分别向同一个账户存3000元，每次存1000，存3次。每次存完打
 * 印账户余额。
 * 问题：该程序是否有安全问题，如果有，如何解决？
 * 【提示】 1，明确哪些代码是多线程运行代码，须写入run()方法
 * 2，明确什么是共享数据。
 * 3，明确多线程运行代码中哪些语句是操作共享数据的
 *
 *
 *
 *
 * 分析：
 * 1.是否有多线程问题 是：两个储户线程
 * 2.是否共享数据 有账户
 * 3.是否有线程安全问题  有
 * @author shkstart
 * @create 2022-05-05-14:55
 */
public class AccountTest {


    public static void main(String[] args) {
        Account a1=new Account();
        Thread t1=new Thread(a1);
        Thread t2=new Thread(a1);
        t1.setName("账户1");
        t2.setName("账户2");
        t1.start();
        t2.start();
    }
}
class Account implements Runnable{
    private int acc;
    ReentrantLock lock=new ReentrantLock(true);
    private  double balance=0;
    @Override

    public  void run() {
        try{
            lock.lock();
            for (int i = 0; i < 3; i++) {
                deposit(1000);
            }
        }finally {
            lock.unlock();
        }

    }
    public void deposit(double amt)  {

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(amt>0){
            balance+=amt;
            System.out.println(Thread.currentThread().getName()+"存钱成功：余额为"+balance);
        }
    }
}
