import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2042 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        long[] numbers = new long[n];
        for (int i = 0; i < n; i++){
            numbers[i] = Long.parseLong(br.readLine());
        }

        SegmentTree segmentTree = new SegmentTree(numbers, n);
        for (int i = 0; i < m+k; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            long c = Long.parseLong(st.nextToken());
            if (a == 1) {
                segmentTree.update(0, numbers.length-1, 1, b-1, c-numbers[b-1]);
                numbers[b-1] = c;
            }
            else {
                bw.write(Long.toString( segmentTree.sum(0, numbers.length-1, 1, b-1, (int) (c-1))) + "\n");
            }
        }
        bw.flush();
    }
    public static class SegmentTree {
        long[] segmentArr;
        public SegmentTree(long[] arr, int n) {
            segmentArr = new long[n * 4];
            init(arr, 0, n -1, 1);
        }
        public long init(long[] arr, int left, int right, int node){
            if (left == right) return segmentArr[node] = arr[left];
            int mid = (left + right) / 2;

            segmentArr[node] += init(arr, left, mid, node*2);
            segmentArr[node] += init(arr, mid + 1, right, node*2+1);

            return segmentArr[node];
        }
        public long sum(int start, int end, int node, int left, int right) {
            if (left > end || right < start) return 0;
            if (left <= start && end <= right) return segmentArr[node];
            int mid = (start+end)/2;
            return sum(start, mid, node*2, left, right) + sum(mid+1, end, node*2+1, left, right);
        }
        public void update(int start, int end, int node, int target, long additionalNumber){
            if (target < start || target > end) return;
            segmentArr[node] += additionalNumber;
            if (start == end) return;
            int mid = (start + end) / 2;
            update(start, mid, node * 2, target, additionalNumber);
            update(mid + 1, end, node * 2 + 1, target, additionalNumber);
        }
    }
}
