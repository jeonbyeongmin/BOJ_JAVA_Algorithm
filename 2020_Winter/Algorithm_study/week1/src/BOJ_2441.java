import java.util.Scanner;

public class BOJ_2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for (int i = 0; i < test; i++){
            for (int j = test-i; j < test; j++){
                System.out.print(" ");
            }
            for (int j = i; j < test; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
