import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int inputNumber[] = new int[n];
        for (int i = 0; i < n; i++){
            inputNumber[i] = sc.nextInt();
        }
        insertionSort(inputNumber);
        for (int i = 0; i < n; i++){
            System.out.println(inputNumber[i]);
        }
    }

    static void selectionSort(int[] a){ // 선택정렬
        for (int i = 0; i < a.length; i++){
            for (int j = i+1; j < a.length; j++){
                if (a[i] > a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

    static void bubbleSort(int[] a){ // 버블정렬
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length-i-1; j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    static void insertionSort(int[] a){
        int j;
        for (int i = 1; i < a.length; i++){
            int b = a[i];
            for (j = i-1; j >= 0 && a[j] > b; j--){
                a[j+1] = a[j];
            }
            a[j+1] =b;
        }
    }
}
