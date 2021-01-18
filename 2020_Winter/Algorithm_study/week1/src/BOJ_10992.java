import java.util.Scanner;

public class BOJ_10992 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = i; j < n; j++){
                System.out.print(" ");
            }

            int temp = n-i;
            for (int j = n-i; j < n; j++){
                if (i == n){
                    System.out.print("*");
                } else {
                    if (j == temp){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            for (int j = n-i+1; j < n; j++){
                if (i == n){
                    System.out.print("*");
                } else {
                    if (j == n-1){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
