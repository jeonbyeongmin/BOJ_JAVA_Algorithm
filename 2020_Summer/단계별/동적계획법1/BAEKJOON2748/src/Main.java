import java.util.Scanner;

public class Main {

    public static long fibonacci[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        fibonacci = new long[n+1];

        fibo(n);

    }
    public static void fibo(int n){
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        System.out.println(fibonacci[n]);
    }
}
