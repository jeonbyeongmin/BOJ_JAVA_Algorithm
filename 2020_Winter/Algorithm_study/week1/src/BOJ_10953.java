import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for (int i = 0; i < test; i++){
            String line = sc.next();
            StringTokenizer st = new StringTokenizer(line, ",");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(a+b);
        }
    }
}
