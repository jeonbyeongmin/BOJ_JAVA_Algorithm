import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        int M = sc.nextInt();
        for (int i = 0; i < M; i++){
            int number = sc.nextInt();
            System.out.println(binarySearch(A, number));
        }
    }

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;

        while(end-start >= 0){
            if (arr[mid] == target){ // target이 가운데 숫자와 같다면?
                return 1;
            } else if (arr[mid] <= target){ // target이 가운데 숫자보다 크다면?
                start = mid + 1;
            } else{ // target이 가운데 숫자보다 작다면?
                end = mid - 1;
            }

            mid = (start+end)/2;
        }
        return 0;
    }
}




