import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int n = newScanner.nextInt();
        int x = newScanner.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = newScanner.nextInt();
        }
        for (int i = 0; i < n; i++){
            if(a[i] < x){
                System.out.print(a[i] + " ");
            }
        }

    }
}
