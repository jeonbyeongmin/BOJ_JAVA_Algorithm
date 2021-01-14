import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        int dp[] = new int[n];

        for (int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }

        int max = A[0];
        dp[0] = A[0];

        for (int i = 1; i < n; i++){
            dp[i] = Math.max(A[i], dp[i-1] + A[i]);
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}
