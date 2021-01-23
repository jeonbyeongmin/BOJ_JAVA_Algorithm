import java.util.Scanner;

public class BOJ_2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stair = new int[Math.max(4, n)];
        int[] dp = new int[Math.max(4, n)];

        for (int i = 0; i < n; i++){
            stair[i] = sc.nextInt();
        }

        dp[0] = stair[0];
        dp[1] = stair[0] + stair[1];
        dp[2] = Math.max(stair[0]+stair[2], stair[1] + stair[2]);

        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(dp[i-3] + stair[i-1] + stair[i], dp[i-2]+stair[i]);
        }
        System.out.println(dp[n-1]);
    }
}
