import java.io.*;

public class BOJ_2751 {
    public static int[] temp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
        int n = Integer.parseInt(br.readLine());
        int[] set = new int[n];

        for (int i = 0; i < n; i++){
            set[i] = Integer.parseInt(br.readLine());
        }

        temp = new int[set.length];
        mergeSort(set, 0, set.length-1);

        for (int val : set){
            bw.write(Integer.toString(val) + "\n");
        }
        bw.flush();
    }
    public static void mergeSort(int[] set, int left, int right){
        if (left < right){
            int mid = (left + right) / 2;
            mergeSort(set, left, mid);
            mergeSort(set, mid+1, right);
            merge(set, left, mid, right);
        }
    }
    public static void merge(int[] set, int left, int mid, int right){
        int p = left;
        int q = mid+1;

        int tempIndex = p;

        while(p <= mid && q <= right){
            if (set[p] < set[q]) {
                temp[tempIndex++] = set[p++];
            } else {
                temp[tempIndex++] = set[q++];
            }
        }
        while(p <= mid){
            temp[tempIndex++] = set[p++];
        }
        while(q <= right){
            temp[tempIndex++] = set[q++];
        }

        for (int i = left; i <= right; i++){
            set[i] = temp[i];
        }
    }
}
