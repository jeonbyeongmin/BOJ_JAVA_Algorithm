import java.util.Scanner;

public class BOJ_9461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++){
            int n = sc.nextInt();
            long[] dp = new long[Math.max(6, n+1)];

            dp[1] = 1;
            dp[2] = 1;
            dp[3] = 1;
            dp[4] = 2;
            dp[5] = 2;

            for (int j = 6; j <= n; j++){
                dp[j] = dp[j-1] + dp[j-5];
            }
            System.out.println(dp[n]);
        }
    }
}
