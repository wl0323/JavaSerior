/**
 * @author shkstart
 * @create 2022-06-06-8:22
 */
public class Test2 {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="abacd";

        System.out.println(method(s1, s2));
    }

    public  static boolean method(String s1, String s2) {
        if(s1==s2){
            return true;
        }
        int t=Math.abs(s1.length()-s2.length());
        if(t>1){
            return false;
        }
        //两个字符串长度差为1时
            if(t==1){

            if(s2.length()>s1.length()){
                int i=0;
                int j=0;

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
                }else if(num==1){
                    return true;
                }
            }
            if(s2.length()<s1.length()){
                int num=0;
                int i=0;
                int j=0;

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
                }else if(num==1){
                    return true;
                }
            }

        }
        return true;
    }



}
