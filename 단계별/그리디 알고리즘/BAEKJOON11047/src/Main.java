import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        int key = 0;
        int result = 0;
        for (int i = 0; i < N; i++){
            if (K/A[i] > 0){
                key = i;
            }

        }


        for (int i = key; i >= 0; i--){
            if (K/A[i] > 0){

                result = result + K/A[i];
                K = K % A[i];
            }
        }

        System.out.println(result);

    }
}
