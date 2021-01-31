import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class BOJ_1929 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        for (int i = firstNumber; i <= secondNumber; i++){
            if (isPrime(i)) bw.write(i + "\n");
        }
        bw.flush();
    }
    static boolean isPrime(int n){
        if (n == 1) return false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++){
                if (n % i == 0) return false;
            }
        }
        return true;
    }
}
