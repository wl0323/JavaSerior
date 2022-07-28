import org.testng.annotations.Test;

/**
 * int length()：返回字符串的长度： return value.length
 *  char charAt(int index)： 返回某索引处的字符return value[index]
 *  boolean isEmpty()：判断是否是空字符串：return value.length == 0
 *  String toLowerCase()：使用默认语言环境，将 String 中的所有字符转换为小写
 *  String toUpperCase()：使用默认语言环境，将 String 中的所有字符转换为大写
 *  String trim()：返回字符串的副本，忽略前导空白和尾部空白
 *  boolean equals(Object obj)：比较字符串的内容是否相同
 *  boolean equalsIgnoreCase(String anotherString)：与equals方法类似，忽略大
 * 小写
 *  String concat(String str)：将指定字符串连接到此字符串的结尾。 等价于用“+”
 *  int compareTo(String anotherString)：比较两个字符串的大小
 *  String substring(int beginIndex)：返回一个新的字符串，它是此字符串的从beginIndex开始截取到最后的一个子字符串。
 *  String substring(int beginIndex, int endIndex) ：返回一个新字符串，它是此字符串从beginIndex开始截取到endIndex(不包含)的一个子字符串。
 *
 * @author shkstart
 * @create 2022-06-03-10:38
 */
public class StringMethod {
    @Test
    public void method(){
        StringTest s1="wanglian";
        System.out.println(s1.endsWith("an"));//判断是否以（）结尾
        boolean b1=s1.startsWith("ww");//判断是否以（）开始
        System.out.println(b1);
        System.out.println(s1.startsWith("ng",2));
        System.out.println(s1.contains("ng"));

        System.out.println(s1.indexOf("ng"));
        System.out.println(s1.indexOf("ng",5));
        System.out.println(s1.lastIndexOf("an",5));
    }

    @Test
    public  void method02(){
        /*
        String replace(char oldChar, char newChar)：返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。
         String replace(CharSequence target, CharSequence replacement)：使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
         String replaceAll(String regex, String replacement) ：使用给定的replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
         String replaceFirst(String regex, String replacement) ： 使 用 给 定 的replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。
         boolean matches(String regex)：告知此字符串是否匹配给定的正则表达式。
         String[] split(String regex)：根据给定正则表达式的匹配拆分此字符串。
         String[] split(String regex, int limit)：根据匹配给定的正则表达式来拆分此
字符串，最多不超过limit个，如果超过了，剩下的全部都放到最后一个元素中
         */
        StringTest s1="wnglan";
        StringTest s2=s1.replace("wng","wang");
        System.out.println(s2);
    }

    public static void main(StringTest[] args) {
        StringTest s1="abcd";
       try {
           System.out.println(s1.charAt(4));
       }catch(Exception e){
           System.out.println(e);
       }
        System.out.println(s1.isEmpty());//判断字符串是否为空

        StringTest s2=s1.toLowerCase();//转小写
        System.out.println(s2);

        StringTest s3=s1.toUpperCase();//转大写
        System.out.println(s3);

        StringTest s4=" wang lian ";
        StringTest s5=s4.trim(); //去除前首尾的空格
        System.out.println(s5);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));

        System.out.println("***********************");
        System.out.println(s4.trim().concat(s2));//把指定字符串连接到此字符串末尾

        System.out.println(s5.compareTo(s3));
    }
}
