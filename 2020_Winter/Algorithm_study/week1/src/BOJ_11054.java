import java.util.Scanner;

public class BOJ_11054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] set = new int[N];
        int[] dp = new int[N];

        for (int i = 0; i < N; i++) {
            set[i] = sc.nextInt();
            dp[i] = 1;
        }

        int max = 1;

        for (int i = 1; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                if (set[i] > set[j] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        for (int i = 1; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                if (set[i] < set[j] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}