import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int n = newScanner.nextInt();
        int temp = 1;
        for (int i = 0; i < n; i++){
            for (int k = i; k > 0; k--){ //공백
                System.out.print(" ");
            }
            for (int j = i; j < 2*n-temp; j++){ // 별
                System.out.print("*");
            }
            temp++;
            System.out.println();
        }

        temp = n-1;
        for (int i = 0; i < n-1; i++){
            for (int k = i+2; k < n; k++){ //공백
                System.out.print(" ");
            }
            for (int j = n-i-2; j < 2*n-temp; j++){ // 별
                System.out.print("*");
            }
            temp--;
            System.out.println();
        }

    }
}
