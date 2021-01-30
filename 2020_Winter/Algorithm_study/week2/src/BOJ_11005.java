import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger n = new BigInteger(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(n.toString(b).toUpperCase());
    }
}
