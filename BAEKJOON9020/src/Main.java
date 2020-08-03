import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCase = sc.nextInt();
        int a, b; // a < b 라고 하자.

        for (int i = 0; i < numberOfCase; i++){
            int n = sc.nextInt(); // 4이상 짝수. 2로 나누어 떨어진다.
            if (isPrime(n/2)){ // n을 2로 나누었을 때 몫이 소수라면?
                a = n/2;
                b = n/2;
                System.out.println(a + " " + b);
            } else{
                int count = 1;
                for (int j = n/2; j <= n;){
                    if (isPrime(j-count) && isPrime(j+count)){
                        a = j-count;
                        b = j+count;
                        System.out.println(a + " " + b);
                        break;
                    }
                    count++;
                }
            }
        }
    }
    static boolean isPrime(int n){
        if (n == 1){
            return false;
        } else{
            for (int i = 2; i <= Math.sqrt(n); i++){
                if (n%i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}