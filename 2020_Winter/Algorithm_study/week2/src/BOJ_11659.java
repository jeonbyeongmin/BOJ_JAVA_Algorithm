import java.io.*;
import java.util.StringTokenizer;

public class BOJ_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] numbs = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++){
            numbs[i] = Integer.parseInt(st.nextToken());
        }

        SegmentTree segmentTree = new SegmentTree(numbs, n);

        for (int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int leftBoundery = Integer.parseInt(st.nextToken());
            int rightBoundery = Integer.parseInt(st.nextToken());
            bw.write(Integer.toString(segmentTree.sum(0, numbs.length-1, 1, leftBoundery-1, rightBoundery-1)) + "\n");
        }
        bw.flush();
    }
}
class SegmentTree {
    int[] segmentArr;
    public SegmentTree(int[] arr, int n) {
        segmentArr = new int[n * 4];
        init(arr, 0, n -1, 1);
    }
    public int init(int[] arr, int left, int right, int node){
        if (left == right) return segmentArr[node] = arr[left];
        int mid = (left + right) / 2;

        segmentArr[node] += init(arr, left, mid, node*2);
        segmentArr[node] += init(arr, mid + 1, right, node*2+1);

        return segmentArr[node];
    }
    public int sum(int start, int end, int node, int left, int right) {
        if (left > end || right < start) return 0;
        if (left <= start && end <= right) return segmentArr[node];
        int mid = (start+end)/2;
        return sum(start, mid, node*2, left, right) + sum(mid+1, end, node*2+1, left, right);
    }
}
