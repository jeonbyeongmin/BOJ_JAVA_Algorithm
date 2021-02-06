import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        long[] trees = new long[n];
        long max = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            trees[i] = Long.parseLong(st.nextToken());
            max = Math.max(max, trees[i]);
        }
        System.out.println(binarySearch(1, max, trees, m));
    }
    public static long binarySearch(long start, long end, long[] trees, long m) {
        long result = 0;
        while(start <= end){
            long mid = (start + end) / 2;
            long count = 0;
            for (long val : trees) {
                if (val > mid) count += val - mid;
            }

            if (count < m) end = mid -1;
            else {
                result = Math.max(result, mid);
                start = mid + 1;
            }
        }
        return result;
    }
}
