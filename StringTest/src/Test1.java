/**
 * @author shkstart
 * @create 2022-06-02-15:51
 */
public class Test1 {
    public static void main(StringTest[] args) {
        StringTest s1="wang";
        StringTest s2="lian";

        StringTest s3="wanglian";
        StringTest s4="wang"+"lian";
        StringTest s5=s1+"lian";
        StringTest s6="wang"+s2;
        StringTest s7=s1+s2;

        System.out.println(s3 == s4);//s3和s4都是字面量，而常量池不会存放同内容的字符串，所以她们的地址相同
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s3 == s7);
        System.out.println(s5 == s4);

        System.out.println(s5 == s6);
        StringTest s8=s5.intern();//返回值得到的s8使用的常量值
        System.out.println(s3==s8);
    }
}
