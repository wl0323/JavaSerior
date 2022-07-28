/**
 * @author shkstart
 * @create 2022-06-06-15:29
 *
 * 对于String、StringBuffer、StringBulider三者的效率
 * StringBulider>StringBuffer>String
 */
public class TestTime {
    public static void main(StringTest[] args) {
        long startTime=0L;
        long endTime=0L;
        StringTest s1="";
        StringBuffer s2=new StringBuffer("");
        StringBuilder s3=new StringBuilder("");
        startTime=System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
           s2.append(StringTest.valueOf(i));
        }
        endTime=System.currentTimeMillis();
        System.out.println("s2的运行时间为:"+(endTime-startTime));

        startTime=System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            s3.append(StringTest.valueOf(i));
        }
        endTime=System.currentTimeMillis();
        System.out.println("s3的运行时间为:"+(endTime-startTime));
        startTime=System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            s1+=i;
        }
        endTime=System.currentTimeMillis();
        System.out.println("s1的运行时间为:"+(endTime-startTime));

    }
}
