import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int n = newScanner.nextInt();
        double a[] = new double[n];
        double sum = 0;

        a[0] = newScanner.nextDouble();
        double max = a[0];

        for (int i = 1 ; i < n; i++){
            a[i] = newScanner.nextDouble();
            if(max < a[i]){
                max = a[i];
            }
        }
        for (int i = 0; i < n; i++){
            a[i] = (a[i]/max)*100;
            sum = sum + a[i];
        }
        System.out.print(sum/n);
    }
}
