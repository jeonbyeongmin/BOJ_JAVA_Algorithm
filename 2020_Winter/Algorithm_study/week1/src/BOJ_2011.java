import java.util.Scanner;

public class BOJ_2011 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String n=scan.next();
        int c[]=new int[n.length()+1];
        int dp[]=new int[n.length()+1];
        int ans=-1;
        dp[0]=1;

        for (int i=1;i<=n.length();i++)
            c[i]=n.charAt(i-1)-'0';

        if (c[1]==0)
            ans=0;
        else {
            dp[1]=1;
            for (int i=2;i<=n.length();i++) {
                if (c[i]==0) {
                    if((c[i-1]>0)&&(c[i-1]<3))
                        dp[i]=dp[i-2];
                    else {
                        ans=0;
                        break;
                    }
                }
                else {
                    if (c[i-1]==1)
                        dp[i]=(dp[i-1]+dp[i-2])%1000000;
                    else if ((c[i-1]==2)&&(c[i]>=1)&&(c[i]<=6))
                        dp[i]=(dp[i-1]+dp[i-2])%1000000;
                    else
                        dp[i]=dp[i-1];
                }
            }
        }
        if (ans!=0)
            ans=dp[n.length()];
        System.out.println(ans);
    }
}
