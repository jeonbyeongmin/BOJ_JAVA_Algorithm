import java.io.*;
/*
       BOJ_6588 해설
       먼저 짝수인 소수는 2가 유일함. 하지만 문제에서는 4보다 큰 수를 다루고 있기 때문에 2는 무시할 수 있음
       이때 2를 무시하면 단순하게 홀수인 두 수를 더해서 짝수를 구하는 문제로 변하는데
       어떤 짝수 n을 만들기 위한 두 홀수에 대해서 다음과 같은 식을 작성할 수 있음.

                              n = n/2-i + n/2+i

       하지만 우리는 홀수이면서 두 값의 차가 가장 큰 소수인 두 수를 구하고 있기 때문에
        n/2-i, n/2+i 각각이 소수이면서 2i가 가장 큰 값을 구하면 해결되는 문제이다.
 */
public class BOJ_6588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int currentNumber;
        while((currentNumber = Integer.parseInt(br.readLine())) != 0){
            int odd1 = 0;
            int odd2 = 0;
            for (int i = currentNumber/2-1; i >= 0 ; i--){
                if (isPrime(currentNumber/2-i) && isPrime(currentNumber/2+i)){
                    odd1 = currentNumber/2-i;
                    odd2 = currentNumber/2+i;
                    break;
                }
            }
            if (odd1 == 0 && odd2 == 0) bw.write("Goldbach's conjecture is wrong.\n");
            bw.write(currentNumber + " = " + odd1 + " + " + odd2 + "\n");
        }
        bw.flush();
    }
    static boolean isPrime(int number){
        if (number == 1) return false;
        else{
            for (int i = 2; i <= Math.sqrt(number); i++){
                if (number % i == 0) return false;
            }
        }
        return true;
    }
}
