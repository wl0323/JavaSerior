import org.testng.annotations.Test;

/**
 * @author shkstart
 * @create 2022-06-02-14:53
 */
public class New {
    public static void main(StringTest[] args) {
        StringTest s1="abc";

        StringTest s2=new StringTest("edf");
        StringTest s3=new StringTest();

    }
    /*
    String的实例化方式：
     1。通过字面量的方式
     2.通过new+构造器的方式
     */
    @Test
    public void test(){
        //通过字面量定义的方式，此时的s1和s2的数据
        // javaEE声明在方法区中的字符串常量池中
        StringTest s1="javaEE";
        StringTest s2="javaEE";
        //通过new+构造器的方式，此时s3和s4保存的地址值，是数据在堆空间中开辟空间以后对应的地址值
        StringTest s3=new StringTest("javaEE");
        StringTest s4=new StringTest("javaEE");
    }

}
