import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int primeNumbCount = 0;

        for (int i = 0; i < n; i++){
            int currentNumb = Integer.parseInt(st.nextToken());
            if (isPrime(currentNumb)){
                primeNumbCount++;
            }
        }
        System.out.println(primeNumbCount);
    }
    static boolean isPrime(int n){
        if (n == 1)return false;
        else{
            for (int i = 2; i<= Math.sqrt(n); i++){
                if (n % i == 0) return false;
            }
        }
        return true;
    }
}
