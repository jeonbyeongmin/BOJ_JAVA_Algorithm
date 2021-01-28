import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class BOJ_1850 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        long gcd = gcd(num1, num2);
        for (int i = 0; i < gcd; i++){
            bw.write("1");
        }
        bw.flush();
    }
    static long gcd(long num1, long num2){
        if (num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }
}
