package callable;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的方式三：实现Callable接口。------jdk5.0新增；
 * @author shkstart
 * @create 2022-05-05-16:46
 */

//创建一个实现Callable的实现类
public class ThreadNew implements Callable {
    @Override
    //实现call方法，将此线程需要执行的操作声明在call中
    public Object call() throws Exception {
        int sum=0;
        for (int i = 0; i <100 ; i++) {
            if(i%2==0){
                System.out.println(i);
                sum+=i;
            }
        }
        return sum;
    }
}
class Test{
    public static void main(String[] args) {
        //创建callable接口实现类的对象
        ThreadNew t1=new ThreadNew();
        //将此callable接口实现类的对象作为传递到FutureTask构造器中，创建FutureTask的对象
        
        FutureTask f1 = new FutureTask(t1);

        new Thread(f1).start();
        try {
            Object o = f1.get();
            System.out.println(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}

