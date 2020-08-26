import java.util.Scanner;

public class Main {
    public static long mod;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        mod = sc.nextInt();

        System.out.println(func(A, B));

    }
    public static long func(long a, long b){
        if (b == 0){
            return 1;
        } else{
            if (b % 2 == 0){ // a^b = a^(b/2) * a^(b/2) (단, b는 짝수)
                long n = func(a, b/2);
                return (n * n) % mod;
            } else{ // a^b = a^((b-1)/2) * a^((b-1)/2) * a^1 (단, b는 홀수)
                long n = func(a, (b-1)/2);
                return (((n * n ) % mod) * a) % mod;
            }
        }
    }

}
