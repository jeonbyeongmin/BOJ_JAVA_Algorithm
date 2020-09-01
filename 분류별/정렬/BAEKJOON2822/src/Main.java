
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[8][2];

        for (int i = 0; i < 8; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = i+1;
        }
        quickSort(arr, 0, arr.length-1);

        int sum = 0;
        int[] temp = new int[5];
        for (int i = 3; i < 8; i++){
            sum += arr[i][0];
            temp[i-3] = arr[i][1];
        }
        Arrays.sort(temp);

        System.out.println(sum);
        for (int value : temp){
            System.out.print(value + " ");
        }


    }
    public static int partition(int[][] arr, int left, int right){
        int pibot = arr[(left+right)/2][0];
        while(left < right) {
            while ((arr[left][0] < pibot) && (left < right)) {
                left++;
            }
            while ((arr[right][0] > pibot) && (left < right)) {
                right--;
            }
            if (left < right) {
                swap(arr, left, right);
            }
        }
        return left;
    }
    public static void quickSort(int[][] arr, int left, int right){
        if (left < right){
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot -1);
            quickSort(arr, pivot+1, right);
        }
    }
    public static void swap(int[][] arr, int a, int b){
        for (int i = 0; i < 2; i++){
            int temp = arr[a][i];
            arr[a][i] = arr[b][i];
            arr[b][i] = temp;
        }

    }
}
