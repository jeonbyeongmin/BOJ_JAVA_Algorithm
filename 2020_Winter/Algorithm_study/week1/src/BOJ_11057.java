import java.util.Scanner;

public class BOJ_11057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] dp = new int[N+1][10];

        for (int i = 0; i <= 9; i++){
            dp[1][i] = 1;
        }
        for (int i = 1; i <= N; i++){
            dp[i][0] = 1;
        }
        for (int i = 2; i <= N; i++){
            for (int j = 1; j <= 9; j++){
                dp[i][j] = (dp[i][j-1] + dp[i-1][j])%10007;
            }
        }

        int sum = 0;
        for (int i = 0; i <= 9; i++){
            sum += dp[N][i];
        }
        System.out.println(sum%10007);
    }
}
