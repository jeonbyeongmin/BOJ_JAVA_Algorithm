import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int a[] = new int[9];

        a[0] = newScanner.nextInt();
        int maxNumber = a[0];
        int maxIndex = 1;
        for (int i = 1; i < 9; i++){
            a[i] = newScanner.nextInt();
            if(maxNumber < a[i]) {
                maxNumber = a[i];
                maxIndex = i+1;
            }
        }
        System.out.println(maxNumber);
        System.out.print(maxIndex);
    }
}
