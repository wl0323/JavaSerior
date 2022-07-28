import java.util.Map;
import java.util.Stack;

/**
 * @author shkstart
 * @create 2022-07-13-21:46
 */
public class TestString {
    public static void main(String[] args) {

        {
            String s1 = "aaaaab";
            String s2 = "aaaaa";
            System.out.println("case2");
            System.out.println(judge(s1, s2));
        }
            {
                String s1 = "aaaaa" ;
                String s2 = "aaaaab";
                System.out.println("case2");
                System.out.println(judge(s1,s2));
            }
    }
    public  static  boolean judge( String s1,String s2){
        if(s1==s2){
            return true;
        }
        int t= Math.abs(s1.length()-s2.length());
        if(t>1){
            return  false;
        }
         if(t==1){
             int i=0;
             int j=0;

             if(s2.length()>s1.length()){
                 int num=0;
                 while (i<s1.length()&&j<s2.length()){

                         if(s1.charAt(i)==s2.charAt(j)){
                             i++;
                             j++;
                         } else {
                             j++;
                             num++;
                         }


                 }
                 if(num>1){
                     return false;
                 }
             }
             if(s2.length()<s1.length()){
                 int num=0;
                 while (i<s1.length()&&j<s2.length()){

                     if(s1.charAt(i)==s2.charAt(j)){
                         i++;
                         j++;
                     } else {
                         i++;
                         num++;
                     }


                 }
                 if(num>1){
                     return false;
                 }
             }

         }

        




        return  true;
    }

}
