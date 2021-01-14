import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A[] = new int[N];
        int result[] = new int[N];

        for (int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        result[0] = 1;
        int max = 1;
        for (int i = 1; i < N; i++){
            result[i] = 1;
            for (int j = 0; j <= i; j++){
                if (A[i] > A[j] && result[i] < result[j]+1){
                    result[i] = result[j]+1;
                }
            }
            if (max < result[i]){
                max = result[i];
            }
        }
        System.out.println(max);
    }
}
