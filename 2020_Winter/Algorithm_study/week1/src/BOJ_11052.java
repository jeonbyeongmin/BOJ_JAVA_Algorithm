import java.util.Scanner;

public class BOJ_11052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n+1];

        for (int i = 1; i <= n; i++){
            price[i] = sc.nextInt();
        }
        /*
        int[][] dp = new int[n+1][n+1];

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i-j < 0){
                    dp[i][j] = dp[i][j-1];
                } else {
                    dp[i][j] = Math.max(price[j] + dp[i-j][j], dp[i][j-1]);
                }
            }
        }
        */
        int[] dp = new int[n+1];

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                dp[i] = Math.max(price[j] + dp[i-j], dp[i]);
            }
        }
        System.out.println(dp[n]);
    }
}
