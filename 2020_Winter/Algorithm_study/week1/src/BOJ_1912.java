import java.util.Scanner;

public class BOJ_1912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] set = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++){    // input
            set[i] = sc.nextInt();
        }
        if (n >= 0) System.arraycopy(set, 0, dp, 0, n);

        int sum = set[0];

        for (int i = 1; i < n; i++){
            sum += set[i];
            sum = Math.max(sum, set[i]);
            dp[i] = Math.max(sum, dp[i-1]);
        }
        System.out.println(dp[n-1]);
    }
}
