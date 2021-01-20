import java.util.Scanner;

public class BOJ_9465 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++){
            int n = sc.nextInt();
            int[][] sticker = new int[2][n];

            for (int j = 0; j < 2; j++){    // input
                for (int k = 0; k < n; k++){
                    sticker[j][k] = sc.nextInt();
                }
            }

            int[][] dp = new int[2][n];

            dp[0][0] = sticker[0][0];
            dp[1][0] = sticker[1][0];
            dp[0][1] = dp[1][0] + sticker[0][1];
            dp[1][1] = dp[0][0] + sticker[1][1];

            for (int k = 2; k < n; k++){
                dp[0][k] = Math.max(dp[1][k - 1], dp[1][k - 2]) + sticker[0][k];
                dp[1][k] = Math.max(dp[0][k - 1], dp[0][k - 2]) + sticker[1][k];
            }
            int answer = Math.max(dp[0][n-1], dp[1][n-1]);
            System.out.println(answer);
        }
    }
}
