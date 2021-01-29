import java.util.Scanner;

public class BOJ_1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i <  test; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a*b/ gcd(a,b));
        }
    }
    static int gcd(int a, int b){
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
}
