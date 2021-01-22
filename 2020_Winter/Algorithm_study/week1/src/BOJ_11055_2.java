import java.util.Scanner;

public class BOJ_11055_2 {      // DP - lis 가장 큰 증가 부분 수열 (메모리 성능 코드량 기존 코드에 비해 더 효율 / 더 단순)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] set = new int[n];
        int[] dp = new int[n];
        int answer = 0;

        for (int i = 0; i < n; i++){
            set[i] = sc.nextInt();
            int max = 0;
            for (int j = 0; j < i; j++){
                if (set[j] < set[i]){
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max+set[i];
            answer = Math.max(dp[i], answer);
        }
        System.out.println(answer);
    }
}
