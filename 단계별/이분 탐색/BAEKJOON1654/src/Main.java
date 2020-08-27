import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        long[] A = new long[K];

        long max = 0;
        for (int i = 0; i < K; i++){
            A[i] = sc.nextLong();
            max = Math.max(max, A[i]);
        }

        long start = 1;
        long end = max;
        long result = 0;

        while(end-start >= 0){

            long mid = (start+end)/2;
            long count = 0;

            for (int j = 0; j < A.length; j++){
                count = count + (A[j]/mid);
            }
            if (count < N){
                end = mid-1;
            } else{
                result = Math.max(result, mid);
                start = mid+1;
            }
        }
        System.out.println(result);
    }
}
