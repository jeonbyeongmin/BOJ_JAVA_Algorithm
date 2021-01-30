import java.io.*;
import java.util.StringTokenizer;

public class BOJ_9345 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int test = Integer.parseInt(br.readLine());
        for (int i = 0; i < test; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[] dvds = new int[n];
            for (int j = 0; j < n; j++){
                dvds[j] = j;
            }
            MinSegmentTree minSegmentTree = new MinSegmentTree(dvds, n);
            MaxSegmentTree maxSegmentTree = new MaxSegmentTree(dvds, n);
            MinSegmentTree minSegmentTree1 = new MinSegmentTree(dvds, n);
            MaxSegmentTree maxSegmentTree1 = new MaxSegmentTree(dvds, n);
            for (int j = 0; j < k; j++){
                st = new StringTokenizer(br.readLine());
                int q = Integer.parseInt(st.nextToken());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                if (q == 0){
                    // update
                    minSegmentTree.update(0, n-1, 1, a, dvds[b]);
                    minSegmentTree.update(0, n-1, 1, b, dvds[a]);
                    maxSegmentTree.update(0, n-1, 1, a, dvds[b]);
                    maxSegmentTree.update(0, n-1, 1, b, dvds[a]);
                    int temp = dvds[b];
                    dvds[b] = dvds[a];
                    dvds[a] = temp;
                } else {
                    // output
                    if (minSegmentTree.min(0, n-1, 1, a, b) == minSegmentTree1.min(0, n-1, 1, a ,b) &&
                            maxSegmentTree.max(0, n-1, 1, a, b) == maxSegmentTree1.max(0, n-1, 1, a, b)){
                        bw.write("YES\n");
                    }
                    else {
                        bw.write("NO\n");
                    }
                }
            }
        }
        bw.flush();
    }
    public static class MinSegmentTree {
        long[] segmentArr;
        public MinSegmentTree(int[] arr, int n){
            segmentArr = new long[n * 4];
            init(arr, 0, n-1, 1);
        }
        public long init(int[] arr, int start, int end, int node){
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
        public long update(int start, int end, int node, int target, int c){
            if (target > end || target < start) return segmentArr[node];
            if (start == end) return segmentArr[node] = c;
            int mid = (start + end) /2;
            return segmentArr[node] = Math.min(update(start, mid, node*2, target, c), update(mid+1, end, node*2+1, target, c));
        }
    }
    public static class MaxSegmentTree {
        long[] segmentArr;
        public MaxSegmentTree(int[] arr, int n){
            segmentArr = new long[n * 4];
            init(arr, 0, n-1, 1);
        }
        public long init(int[] arr, int start, int end, int node){
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
        public long update(int start, int end, int node, int target, int c){
            if (target > end || target < start) return segmentArr[node];
            if (start == end) return segmentArr[node] = c;
            int mid = (start + end) /2;
            return segmentArr[node] = Math.max(update(start, mid, node*2, target, c), update(mid+1, end, node*2+1, target, c));
        }
    }
}
