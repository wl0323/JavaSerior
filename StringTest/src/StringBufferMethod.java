import org.testng.annotations.Test;

/**
 * StringBuffer append(xxx)：提供了很多的append()方法，用于进行字符串拼接
 * StringBuffer delete(int start,int end)：删除指定位置的内容
 * StringBuffer replace(int start, int end, String str)：把[start,end)位置替换为str
 * StringBuffer insert(int offset, xxx)：在指定位置插入xxx
 * StringBuffer reverse() ：把当前字符序列逆转
 * @author shkstart
 * @create 2022-06-06-14:26
 */
public class StringBufferMethod {
     @Test
    public void test1(){
    StringBuffer s1=new StringBuffer();
    s1.append(1);
    s1.append('j');
    System.out.println(s1);
    StringBuffer s2=new StringBuffer("abcdefg");
    s2.delete(4,6);//包含4不包含6，
    System.out.println(s2);
    s2.replace(3,4,"hello");
    System.out.println(s2);
    s2.insert(2,false);//插入
    System.out.println(s2);
    StringBuffer s3=new StringBuffer("nailgnaw");
    s3.reverse();
    System.out.println(s3);
    StringTest s4=s3.substring(0,4);
    System.out.println(s4);

    StringBuffer s5=new StringBuffer();
    s5.append('k').append('j').append(false).insert(1,"abc").delete(3,5).replace(3,4,"hello").reverse();
         System.out.println(s5);

    }





}
