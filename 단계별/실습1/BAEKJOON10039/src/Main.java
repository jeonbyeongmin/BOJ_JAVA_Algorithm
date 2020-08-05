import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int a[] = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++){
            a[i] = newScanner.nextInt();
            if(a[i] <= 40){
                a[i] = 40;
            }
            sum = sum +  a[i];
        }
        System.out.print(sum/5);
    }
}
