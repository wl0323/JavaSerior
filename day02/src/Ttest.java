import java.util.Scanner;

/**
 * @author shkstart
 * @create 2022-06-02-13:49
 */
public class Ttest {
    public static void main(String[] args) {
        int i;
        Scanner in=new Scanner( System.in);
        int c=in.nextInt();
        for(i=1;i<=c;i++){
            for( int j=1;j<=i;j++){
                System.out.print(j+"\t");
                if(j==c){
                    System.out.println();
                   int k;
                   for(k=j-1;k>0;k--){
                       for(int t=1;t<=k;t++){
                           System.out.print(t+"\t");
                       }
                       System.out.println();
                   }
                }
            }
            System.out.println();
        }
    }
}
