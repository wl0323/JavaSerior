import org.testng.annotations.Test;

/**
 *
 *
 * String 的使用：
 *     字符串，用一对”“引起来表示
 *     1.String 声明为final的，不可以被基础
 *     2，String 实现了Serializable接口：表示字符串是支持序列化的
 *               实现了Comparable接口：表示String可以比较大小
 *     3。String 内部定义了final char[] value用于存储字符串数据
 *     4.String 代表不可变的字符序列。简称：不可变性
 *     体现：1.当对字符串重新赋值时，需要重新指定内存区域赋值，不嫩使用原来的value进行赋值
 *          2。当对现有的字符串进行连接操作时，需要重新指定内存区域赋值，不嫩使用原来的value进行赋
 *          3.当使用replace方法修改字符型时，需要重新指定内存区域赋值，不嫩使用原来的value进行赋
 *    5:通过字面量的方式给一个字符串赋值，此时的字符串值声明在字符串常量池中
 *     6.字符串常量池不会存储相同内容的字符串
 * @author shkstart
 * @create 2022-06-01-9:08
 */
public class string {

   @Test
   public  void test1(){
     StringTest s1="abc";
     StringTest s2="abc";
     s1="hello";

     System.out.println(s1==s2);
      System.out.println(s1);
      System.out.println(s2);
      System.out.println("*********************************");

        StringTest s3="abc";
        s3+="edf";
         System.out.println(s3);
         System.out.println(s2);
        StringTest s4="abc";
        StringTest s5=s4.replace('a','b');
       System.out.println(s4);
       System.out.println(s5);

   }
}
