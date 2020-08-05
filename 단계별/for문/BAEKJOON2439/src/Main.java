import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int count = newScanner.nextInt();
        for (int i = count; i > 0; i--){
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= count; k ++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
