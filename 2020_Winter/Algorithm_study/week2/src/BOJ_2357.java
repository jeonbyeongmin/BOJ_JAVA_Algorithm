import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] numbers = new long[n];
        for (int i = 0; i < n; i++){
            numbers[i] = Long.parseLong(br.readLine());
        }

        MinSegmentTree minSegmentTree = new MinSegmentTree(numbers, n);
        MaxSegmentTree maxSegmentTree = new MaxSegmentTree(numbers, n);

        for (int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(minSegmentTree.min(0, n-1, 1, a-1, b-1) + " " + maxSegmentTree.max(0, n-1, 1, a-1, b-1) + "\n");
        }
        bw.flush();
    }
    public static class MinSegmentTree {
        long[] segmentArr;
        public MinSegmentTree(long[] arr, int n){
            segmentArr = new long[n * 4];
            init(arr, 0, n-1, 1);
        }
        public long init(long[] arr, int start, int end, int node){
            if (start == end) return segmentArr[node] = arr[start];
            int mid = (start + end) / 2;
            return segmentArr[node] = Math.min(init(arr, start, mid, node*2), init(arr, mid+1, end, node*2+1));
        }
        public long min(int start, int end, int node, int left, int right){
            if (left > end || right < start) return Long.MAX_VALUE;
            if (left <= start && end <= right) return segmentArr[node];
            int mid = (start + end) / 2;
            return Math.min(min(start, mid, node*2, left, right), min(mid+1, end, node*2+1, left, right));
        }
    }
    public static class MaxSegmentTree {
        long[] segmentArr;
        public MaxSegmentTree(long[] arr, int n){
            segmentArr = new long[n * 4];
            init(arr, 0, n-1, 1);
        }
        public long init(long[] arr, int start, int end, int node){
            if (start == end) return segmentArr[node] = arr[start];
            int mid = (start + end) / 2;
            return segmentArr[node] = Math.max(init(arr, start, mid, node*2), init(arr, mid+1, end, node*2+1));
        }
        public long max(int start, int end, int node, int left, int right){
            if (left > end || right < start) return Long.MIN_VALUE;
            if (left <= start && end <= right) return segmentArr[node];
            int mid = (start + end) / 2;
            return Math.max(max(start, mid, node*2, left, right), max(mid+1, end, node*2+1, left, right));
        }
    }
}
