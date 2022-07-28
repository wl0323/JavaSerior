import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 *
 * 涉及到String类与其他结构之间的转换
 * @author shkstart
 * @create 2022-06-03-20:13
 */
public class StringTest1 {

    @Test
    // String 转为基本数据类型、包装类：调用包赚类的静态方法：parse***()
    //反之使用string.valueOf()
    public  void test1(){
    StringTest s1="123";
    int s=Integer.parseInt(s1);
    System.out.println(s);
        int i=2334;
        StringTest s2= StringTest.valueOf(i);
        System.out.println(s2);
    }
    @Test
    //String 与 char[]之间的转换
    //  String ---->char[] 调用String的toCharArray()
    //  char[]----->String :调用String的构造器
    public void test2(){
      StringTest s1="1234ab";
      char[] c=s1.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.println("c["+i+"]"+c[i]);
        }

        char[] arr=new char[]{'2','3','t','5'};
        StringTest str2=new StringTest(arr);
        System.out.println(str2);
    }

@Test
//String 与 byte[]之间的转换
//String -->byte[] :调用String的getByte（）
    public void test3() throws UnsupportedEncodingException {
        StringTest str1="abc123中国";
        byte[] b=str1.getBytes();//使用默认的字符集，进行转换
         System.out.println(Arrays.toString(b));


        byte[] gbks=str1.getBytes("gbk");
         System.out.println(Arrays.toString(gbks));




}






}
