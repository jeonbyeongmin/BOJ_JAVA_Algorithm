import java.util.Scanner;

public class BOJ_2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int gcd = gcd(num1, num2);
        System.out.print(gcd + "\n" + num1*num2/gcd);
    }
    public static int gcd(int a, int b){
        if (b == 0) return a;
        else return gcd(b, a%b);
    }
}
