import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < N; i++){
            System.out.println(arr[0]/gcd(arr[0], arr[i]) + "/" + arr[i]/gcd(arr[0], arr[i]));
        }
    }

    public static int gcd(int a, int b){
        if (a > b) {
            if (a % b == 0){
                return b;
            } else{
                return gcd(b, a % b);
            }
        } else{
            if (b % a == 0){
                return a;
            } else{
                return gcd(a, b % a);
            }
        }

    }
}
