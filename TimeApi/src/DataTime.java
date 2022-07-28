import org.testng.annotations.Test;

import java.util.Date;

/**
 * @author shkstart
 * @create 2022-06-06-15:59
 */
public class DataTime {
    @Test
    public void test1(){
        long time=System.currentTimeMillis();
        System.out.println(time);
    }

    @Test
    /*java.util.Date类
            ---java.sql.Date类
       1.两种构造器的使用
       2.两个方法的使用
       >toString :显示当前的年月日分秒
       >getTime:获取当前Date对象的毫秒数
      3.java.sql.Date：数据库
    */
    public void test2(){
        //构造器一：Date():创建一个对应当前时间的Date对象
       Date date1=new Date();
        System.out.println(date1.toString());
        System.out.println(date1.getTime());
        //构造器二：创建指定毫秒数的Date对象
        Date date2=new Date(234552378832768L);
        System.out.println(date2.toString());
    }
}
