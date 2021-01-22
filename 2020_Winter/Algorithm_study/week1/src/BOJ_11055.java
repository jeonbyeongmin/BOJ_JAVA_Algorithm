import java.util.Scanner;

public class BOJ_11055 {    // lis 가장 큰 증가 부분 수열 (메모리 성능 / 코드량 비효율)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] set = new int[N];

        for (int i = 0; i < N; i++){
            set[i] = sc.nextInt();
        }
        int[] dp = new int[N];
        if (N >= 0) System.arraycopy(set, 0, dp, 0, N);

        for (int i = 0; i < N; i++){
            for (int j = i+1; j < N; j++){
                if (set[i] < set[j] && dp[j] < dp[i]+set[j]){
                    dp[j] = dp[i]+set[j];
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
