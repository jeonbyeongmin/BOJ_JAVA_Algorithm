import java.util.Scanner;

public class BOJ_1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] dp = new int[1000001];

        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;

        for (int i = 4; i <= input; i++){
            int min = Integer.MAX_VALUE;
            if (i % 3 == 0){
                min = Math.min(min, dp[i/3] + 1);
            }
            if (i % 2 == 0){
                min = Math.min(min, dp[i/2] + 1);
            }
            min = Math.min(min, dp[i-1] + 1);
            dp[i] = min;
        }
        System.out.println(dp[input]);
    }
}
