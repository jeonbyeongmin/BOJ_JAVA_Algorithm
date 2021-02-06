import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        long[] arr = new long[K];
        long max = 0;

        for (int i = 0; i < K; i++){
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
        }

        System.out.println(binarySearch(1, max, arr, N));
    }
    public static long binarySearch(long start, long end, long[] arr, int N){
        long result = 0;
        while(end - start >= 0) {

            int count = 0;
            long mid = (start + end) / 2;
            for (long value : arr) count += value / mid;

            if (count < N) end = mid-1;
            else {
                result = Math.max(result, mid);
                start = mid+1;
            }
        }
        return result;
    }
}
