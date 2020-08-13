import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int samgakhyeong[][] = new int[n][n];
        int result = 0;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < i+1; j++){
                samgakhyeong[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i < n; i++){
            for (int j = 0; j < i+1; j++){
                if (j == 0) {
                    samgakhyeong[i][j] += samgakhyeong[i-1][j];
                } else if (j == i){
                    samgakhyeong[i][j] += samgakhyeong[i-1][j-1];
                } else {
                    samgakhyeong[i][j] += Math.max(samgakhyeong[i-1][j-1], samgakhyeong[i-1][j]);
                }
            }

        }

        for (int i = 0; i < n; i++){
            result = Math.max(samgakhyeong[n-1][i], result);
        }
        System.out.println(result);
    }
}
