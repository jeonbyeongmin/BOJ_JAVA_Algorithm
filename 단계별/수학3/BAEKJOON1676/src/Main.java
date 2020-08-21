import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n / 5 >= 1){
            n = n/5;
            sum = sum + n;
        }

        System.out.println(sum);
    }
}
