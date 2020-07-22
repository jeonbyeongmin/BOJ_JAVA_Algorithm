import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int n = newScanner.nextInt();
        int a[] = new int[n];

        a[0] = newScanner.nextInt();
        int min = a[0];
        int max = a[0];

        for (int i = 1; i < n; i++){
            a[i] = newScanner.nextInt();
            if (min > a[i]){
                min = a[i];
            }
            if(max < a[i]){
                max = a[i];
            }
        }
        System.out.print(min + " " + max);
    }
}
