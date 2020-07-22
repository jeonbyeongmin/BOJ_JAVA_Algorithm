import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int n = newScanner.nextInt();

        for (int i = 0; i < n; i++){
            for (int j = 1; j <= n; j++){
                if (j%2 != 0) { // 홀수면 별찍기
                    System.out.print("*");
                } else{
                    System.out.print(" "); // 짝수엔 공백
                }
            }
            System.out.println();
            for (int k = 1; k <= n; k++){
                if (k%2 == 0) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
