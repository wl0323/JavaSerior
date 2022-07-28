import org.testng.annotations.Test;

/**
 * @author shkstart
 * @create 2022-06-05-9:13
 */
public class StringBufferBuilder {
    /*
    String:不可变的字符序列
    StringBuffer：可变的字符序列  线程安全的，所以低效
    StringBuilder：可变的字符序列  线程不安全。高效的
     */


    @Test
    public void test1(){
        StringBuffer sb1=new StringBuffer("abc");
        sb1.setCharAt(0,'m');
        sb1.setCharAt(1,'s');
        sb1.setCharAt(2,'p');
        sb1.append('l');
        sb1.setCharAt(3,'b');
        System.out.println(sb1);


        StringBuffer sb2=new StringBuffer();    
        sb2.append('w');
        sb2.append('a');
        sb2.append("abcetrewyttreuytriuyriuoiuypoijkhjkgkhjfhgjfhfdghdfghdgh");
        System.out.println(sb2);
        StringBuffer sb3=new StringBuffer("wang");
        System.out.println(sb3.length());
    }
}
