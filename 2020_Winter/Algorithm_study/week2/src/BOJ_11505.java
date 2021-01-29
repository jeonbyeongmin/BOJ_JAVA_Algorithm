import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11505 {
    public static final int MOD = 1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        long[] arr = new long[n];

        for (int i = 0; i < n; i++){
            arr[i] = Long.parseLong(br.readLine());
        }

        SegmentTree segmentTree = new SegmentTree(arr, n);
        for (int i = 0; i < m+k; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == 1){
                segmentTree.update(0, arr.length-1, 1, b-1, c);
                arr[b-1] = c;
            } else {
                bw.write(Long.toString(segmentTree.mul(0, arr.length-1, 1, b-1,  c-1)) + "\n");
            }
        }
        bw.flush();
    }
    public static class SegmentTree {
        long[] segmentArr;
        public SegmentTree(long[] arr, int n){
            segmentArr = new long[n * 4];
            init(arr, 0, n-1, 1);
        }
        public long init(long[]arr, int start, int end, int node){
            if (start == end) return segmentArr[node] = arr[start];
            int mid = (start + end) / 2;
            return segmentArr[node] = (init(arr, start, mid, node*2) * init(arr, mid+1, end, node*2+1))%MOD;
        }
        public long mul(int start, int end, int node, int left, int right){
            if (left > end || right < start) return 1;
            if (left <= start && end <= right) return segmentArr[node];
            int mid = (start + end) / 2;
            return (mul(start, mid, node*2, left, right) * mul(mid+1, end, node*2+1, left, right))%MOD;
        }
        public long update(int start, int end, int node, int target, int c){
            if (target > end || target < start) return segmentArr[node];
            if (start == end) return segmentArr[node] = c;

            int mid = (start + end) / 2;
            return segmentArr[node] = update(start, mid, node*2, target, c) * update(mid+1, end, node*2+1, target, c) % MOD;
        }
    }
}
