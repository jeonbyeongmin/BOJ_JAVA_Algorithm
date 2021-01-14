import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long tiles[] = new long[N+1];


        tiles[0] = 1;
        tiles[1] = 2;
        int count = 2;
        for (int i = 2; i <= N; i++){
            tiles[i] = (tiles[i-1] + tiles[i-2]) % 15746 ;
        }
        System.out.println(tiles[N-1]);
    }
}
