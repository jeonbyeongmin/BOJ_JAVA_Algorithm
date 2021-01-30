import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1517 {
    public static long[] temp;
    public static long count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] numbers = new long[n];
        temp = new long[n];
        count = 0;

        for (int i = 0; i < n; i++){
            numbers[i] = Long.parseLong(st.nextToken());
        }
        mergeSort(numbers, 0, numbers.length-1);
        System.out.println(count);
    }
    public static void mergeSort(long[] arr, int left, int right){
        if (left < right){
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }
    public static void merge(long[] arr, int left, int mid, int right){
        int p = left;
        int q = mid+1;
        int tempIndex = p;

        while(p <= mid && q <= right){
            if (arr[p] > arr[q]){
                count += mid - p + 1;
                temp[tempIndex++] = arr[q++];
            } else {
                temp[tempIndex++] = arr[p++];
            }
        }
        while(p <= mid){
            temp[tempIndex++] = arr[p++];
        }
        while(q <= right){
            temp[tempIndex++] = arr[q++];
        }

        for (int i = left; i <= right; i++){
            arr[i] = temp[i];
        }
    }
}
