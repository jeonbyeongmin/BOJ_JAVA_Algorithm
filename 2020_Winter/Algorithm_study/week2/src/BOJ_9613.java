import java.io.*;
import java.util.StringTokenizer;

public class BOJ_9613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++){
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line, " ");

            int n = Integer.parseInt(st.nextToken());
            long[] numbs = new long[n];
            for (int j = 0 ; j < n; j++){
                numbs[j] = Integer.parseInt(st.nextToken());
            }

            long gcdSum = 0;
            for (int j = 0; j < n; j++){
                for (int k = j+1; k < n; k++){
                    gcdSum += gcd(numbs[j], numbs[k]);
                }
            }
            bw.write(Long.toString(gcdSum) + "\n");
        }
        bw.flush();
    }
    static long gcd(long a, long b){
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
}
