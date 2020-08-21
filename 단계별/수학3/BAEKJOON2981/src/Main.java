import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());// 종이에 적은 수
        long number[] = new long[N];

        for (int i = 0; i < N; i++){
            number[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(number);

        // 나머지가 같은지 확인하기 위해.
        long temp = number[1] - number[0];
        for (int i = 2; i < N; i++){
            temp = gcd(temp, number[i] - number[i-1]);
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 2; i <= temp; i++){
            if (temp % i == 0){
                sb.append(i + " ");
            }
        }
        System.out.println(sb.toString());

    }

    //유클리드 호제법을 이용.
    public static long gcd(long n, long m){
        if (n % m == 0){
            return m;
        } else{
            return gcd(m, n % m);
        }
    }
}
