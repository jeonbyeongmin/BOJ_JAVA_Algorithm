import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); //최소
        int n = sc.nextInt(); //최대

        for (int i = m; i <= n; i++){
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }
    static boolean isPrime(int n){
        if (n == 1){
            return false;
        } else{
            for (int i = 2; i <= Math.sqrt(n); i++){ // n의 수가 높을수록 오래 걸리기 때문에 제곱근까지만 돌려주는 것이 더 빠르다.
                if (n%i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}

