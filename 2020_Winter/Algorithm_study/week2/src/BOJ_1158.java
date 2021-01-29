import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BOJ_1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= n; i++){
            deque.add(i);
        }
        System.out.print("<");
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= k; j++){
                if (j == k) System.out.print(deque.poll());
                else deque.offer(deque.poll());
            }
            if (i != n) System.out.print(", ");
        }
        System.out.print(">");
    }
}
