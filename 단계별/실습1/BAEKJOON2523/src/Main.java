import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScannr = new Scanner(System.in);

        int n = newScannr.nextInt();

        for (int i = 0; i < n; i++){
            for (int j = i; j >= 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n-1; i++){
            for (int j = i; j < n-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
