import java.util.Scanner;

public class BOJ_2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 0; i < input; i++){
            for (int j = input-i-1; j < input; j++){
                System.out.print("*");
            }
            for (int j = i+1; j < input; j++){
                System.out.print(" ");
            }
            for (int j = i+1; j < input; j++){
                System.out.print(" ");
            }
            for (int j = input-i-1; j < input; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < input; i++){
            for (int j = i+1; j < input; j++){
                System.out.print("*");
            }
            for (int j =  input-i-1; j < input; j++){
                System.out.print(" ");
            }
            for (int j = input-i-1; j < input; j++){
                System.out.print(" ");
            }
            for (int j = i+1; j < input; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
