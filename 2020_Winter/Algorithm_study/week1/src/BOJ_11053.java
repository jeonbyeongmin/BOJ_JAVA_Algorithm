import java.util.Scanner;

public class BOJ_11053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] set = new int[N];

        for (int i = 0; i < N; i++){
            set[i] = sc.nextInt();
        }

        int[] dp = new int[N];
        for (int i = 0; i < N; i++){
            dp[i] = 1;
        }

        for (int i = 0; i < N; i++){
            for (int j = i+1; j < N; j++){
                if (set[i] < set[j] && dp[i]+1 > dp[j]){
                    dp[j] = dp[i]+1;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < N; i++){
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);

    }
}
