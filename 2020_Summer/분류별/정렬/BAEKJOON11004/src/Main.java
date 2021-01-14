
import java.util.Scanner;

public class Main {
    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, arr.length-1);

        System.out.println(arr[k-1]);
    }
    public static int partition(int arr[], int left, int right){
        int pivot = arr[(left+right)/2];
        while(left < right){
            while((arr[left] < pivot) && (left < right)){
                left++;
            }
            while((arr[right] > pivot) && (left < right)){
                right--;
            }
            if (left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        return left;
    }
    public static void quickSort(int arr[], int left, int right){
        if (left < right){
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot-1);
            quickSort(arr, pivot+1, right);
        }
    }
}
