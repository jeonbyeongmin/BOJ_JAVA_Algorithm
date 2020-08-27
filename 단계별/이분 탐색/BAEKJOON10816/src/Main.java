
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[20000001];
        for (int i = 0; i < N; i++){
            arr[sc.nextInt()+10000000]++;
        }
        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++){
            int number = sc.nextInt();
            sb.append(arr[number+10000000] + " ");
        }
        System.out.println(sb);
    }
}
