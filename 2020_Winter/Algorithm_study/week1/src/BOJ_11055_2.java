import java.util.Scanner;

public class BOJ_11055_2 {             // lis 더 단순한 방법
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
