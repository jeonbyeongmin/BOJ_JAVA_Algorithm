import java.util.Scanner;

public class BOJ_10991 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = i; j < n; j++){
                System.out.print(" ");
            }
            int a = 1;
            for (int j = n-i; j < n; j++){
                if (a % 2 == 0){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                a++;
            }
            for (int j = n-i+1; j < n; j++){
                if (a % 2 == 0){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                a++;
            }
            System.out.println();
        }
    }
}
