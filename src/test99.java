import java.util.Scanner;

/**
 * @author shkstart
 * @create 2022-07-15-20:29
 */
public class test99 {
    public static void main(String[] args) {
        String s1 = "slippers";
        Scanner in = new Scanner(System.in);
        String s2 = in.nextLine();

        //多一个或者少一个
        int t = s1.length() - s2.length();
        if (Math.abs(t) >= 2) {
            System.out.println("不可以修改");
            return;
        }
        if (s1.contains(s2) || s2.contains(s1)) {
            System.out.println("可以修改");
            return;
        }

        //测试是否错一个
        int num = 0;
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length() - 1; i++) {
                if (s1.charAt(i) == s2.charAt(i)) {
                    num++;
                }
            }
        }
        if (num == s1.length() - 2) {
            System.out.println("可以修改");
            return;
        }

        //测试相邻的相反的
        if (s1.length() == s2.length()) {
            if (s1.charAt(0) != s2.charAt(0)) {
                if (s1.charAt(1) == s2.charAt(0)) {
                    System.out.println("可以修改");
                    return;
                }

            }
            int count = 0;
            if (s1.charAt(0) == s2.charAt(0)) {
                for (int i = 1; i < s1.length() - 2; i++) {


                    if (s1.charAt(i) != s2.charAt(i)) {
                        if (s2.charAt(i) == s1.charAt(i + 1) || s2.charAt(i) == s1.charAt(i - 1)) {
                            count++;
                        }
                    }
                }

            }
            if (count == 1) {
                System.out.println("可以修改");
                System.exit(0);
            }


        }
        System.out.println("不可以修改");
    }
}