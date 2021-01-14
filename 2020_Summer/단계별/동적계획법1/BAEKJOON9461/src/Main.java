import java.util.Scanner;

public class Main {
    public static long tri[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfCase = sc.nextInt();
        tri = new long[101];

        tri[0] = 1;
        tri[1] = 1;
        tri[2] = 1;
        tri[3] = 2;
        tri[4] = 2;

        for (int i = 5; i <= 100; i++){
            tri[i] = tri[i-1] + tri[i-5];
        }
        for (int i = 0; i < numberOfCase; i++){
            int N = sc.nextInt();
            System.out.println(tri[N-1]);
        }
    }
}
