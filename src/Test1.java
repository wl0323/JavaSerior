import java.util.Stack;
/**
 * @author shkstart
 * @create 2022-06-05-20:16
 */
public class Test1 {
    public static void main(String[] args) {
        {
            String s1 = "china" ;
            String  s2 = "china";
            System.out.println("case1");
            System.out.println(judge(s1,s2));
        }

        {
            String s1 = "aaaaa" ;
            String s2 = "aabaaa";
            System.out.println("case2");
            System.out.println(judge(s1,s2));
        }
    }
    public static boolean judge(String s1, String s2){
        if(s1.equals(s2)){
            return true;
        }
        int t = Math.abs(s1.length() - s2.length());
        if (t >1) {
            return false;
        }
        else if(t==1){
                String v=s1.length()>s2.length()?s1:s2;//长字符串
                String s=s1.equals(v)?s2:s1;//短字符串
                int i=0;
                int j=0;
                int num=0;
                while (v.length()>i&&s.length()>j){
                    if(v.charAt(i)==s.charAt(j)){
                        i++;
                        j++;
                    }
                    else {
                        i++;
                        num++;
                    }
                }
                if(num<=1){
                    return true;
                }else {
                    return false;
                }

            }
        else if(t==0){
            int num=0;
            for (int i = 0; i < s1.length(); i++) {
                if(s1.charAt(i)!=s2.charAt(i)){
                    num++;
                }
            }
                if(num>2){
                    return false;
                }else
                if(num==2){
                  for(int k=0;k<s1.length()-1;k++){
                      if(s1.charAt(k)!=s2.charAt(k)){
                          if(s1.charAt(k)==s2.charAt(k+1)&&s2.charAt(k)==s1.charAt(k+1)){
                                return true;
                          }else {
                              return false;
                          }
                      }
                  }
                }else {
                    return true;
                }
        }
        return true;
    }
}
