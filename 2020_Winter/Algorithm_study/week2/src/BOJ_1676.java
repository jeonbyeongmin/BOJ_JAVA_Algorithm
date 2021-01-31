import java.util.Scanner;

public class BOJ_1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n / 5 >= 1){
            sum += n / 5;
            n /= 5;
        }
        System.out.println(sum);
    }
}
