
import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // 파스칼의 삼각형과 Dp 이용하기....
        Scanner sc = new Scanner(System.in);
        int mod = 10007;
        int N = sc.nextInt();
        int K = sc.nextInt();

        int pascal[][] = new int[N+1][N+1];

        pascal[0][0] = 1;
        pascal[1][0] = 1;
        pascal[1][1] = 1;

        for (int i = 2; i <= N; i++){
            for (int j = 0; j <= i; j++){
                if (j == 0){
                    pascal[i][j] = 1;
                } else if (i == j){
                    pascal[i][j] = 1;
                } else{
                    pascal[i][j] = (pascal[i-1][j] + pascal[i-1][j-1]) % mod;
                }
            }
        }
        System.out.println(pascal[N][K]);
    }
}
