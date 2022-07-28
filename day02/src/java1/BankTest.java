package java1;

/**
 * @author shkstart
 * @create 2022-05-03-17:27
 */
public class BankTest {
}
class Bank{
    private Bank() {
    }
    private  static Bank instance =null;
    //方式二
//    public  synchronized static  Bank getInstance() {
//        if(instance==null){
//            instance=new Bank();
//
//        }
//        return  instance;
//    }
    public  static  Bank getInstance() {
        //方式一：
        synchronized (Bank.class) {
            if (instance == null) {
                instance = new Bank();
            }
            return instance;
        }
    }
}