import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCase = sc.nextInt();
        int count = 0;
        for (int i = 0 ; i < numberOfCase; i++){
            int n = sc.nextInt();
            if(isDecimal(n)){
                count++;
            }
        }
        System.out.println(count);
    }
    static boolean isDecimal(int n){
        int count = 0;
        if (n == 1){ // 1은 소수가 아니다.
            return false;
        } else{
            for (int i = 2; i <= Math.sqrt(n); i++){
                if (n%i == 0){ // n을 2~n의제곱근으로 나누어 떨어진다면 소수가 아니다.
                    return false;
                }
            }
        }
        return true;
    }
}
