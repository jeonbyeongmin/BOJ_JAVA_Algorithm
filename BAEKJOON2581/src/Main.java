import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); //최소
        int n = sc.nextInt(); //최대

        int sumOfPrimeNumber = 0;
        int minOfPrimeNumber = n;

        for (int i = m; i <= n; i++){
            if (isPrime(i)) {
                sumOfPrimeNumber = sumOfPrimeNumber + i; // 소수의
                if (minOfPrimeNumber > i) { // 최소 소수값 구하기.
                    minOfPrimeNumber = i;
                }
            }
        }

        if (sumOfPrimeNumber == 0){ // 소수가 없었다면 -1 출력.
            System.out.println("-1");
        } else{ // 소수가 있었다면 소수의 합과 최소 소수값을 출력.
            System.out.println(sumOfPrimeNumber);
            System.out.println(minOfPrimeNumber);
        }

    }

    static boolean isPrime(int n){
        if (n == 1){
            return false;
        } else{
            for (int i = 2; i < n; i++){
                if (n%i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
