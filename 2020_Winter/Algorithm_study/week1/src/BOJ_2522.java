
import java.util.Scanner;

public class BOJ_2522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a; i++){
            for (int j = i; j < a-1; j++){
                System.out.print(" ");
            }
            for (int j = a-i; j <= a; j++){
                System.out.print(("*"));
            }
            System.out.println();
        }
        for (int i = 1; i < a; i++){
            for (int j = a-i; j < a; j++){
                System.out.print(" ");
            }
            for (int j = i; j < a; j++){
                System.out.print(("*"));
            }
            System.out.println();
        }
    }
}
