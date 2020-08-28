
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        long start = 1;
        long end = k;
        long result = 0;
        while(end - start >= 0){
            long mid = (start+end)/2;
            long count = 0;
            for (int i = 1; i <= n; i++){
                count = (count + Math.min(mid/i, n));
            }
            if (count >= k){
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(result);
    }
}
