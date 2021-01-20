import java.util.Scanner;

public class BOJ_2156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] glasses = new int[Math.max(3, n)];

        for (int i = 0; i < n; i++){
            glasses[i] = sc.nextInt();
        }

        int[] dp = new int[Math.max(3, n)];
        dp[0] = glasses[0];
        dp[1] = glasses[0] + glasses[1];
        dp[2] = Math.max(Math.max(dp[1], glasses[0]+glasses[2]), glasses[1]+glasses[2]);

        for (int i = 3; i < n; i++){
            dp[i] = Math.max(Math.max(dp[i-1], dp[i-3]+glasses[i-1]+glasses[i]), dp[i-2]+glasses[i]);
        }
        System.out.println(dp[n-1]);
    }
}
