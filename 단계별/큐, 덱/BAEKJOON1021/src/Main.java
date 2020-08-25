import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Deque<Integer> deq = new ArrayDeque<>();

        for (int i = 1; i <= N; i++){
            deq.add(i);
        }

        int result = 0;

        for (int i = 0; i < M; i++){

            Deque<Integer> deqLeft = new ArrayDeque<>();
            Deque<Integer> deqRight = new ArrayDeque<>();

            for (int number : deq){
                deqLeft.add(number);
                deqRight.add(number);
            }

            int number = sc.nextInt();
            int left = 0;
            int right = 0;

            while(true){
                if (deqLeft.getFirst() == number){
                    deqLeft.remove();
                    break;
                }
                deqLeft.addLast(deqLeft.removeFirst());
                left++;
            }

            while(true){
                if (deqRight.getFirst() == number){
                    deqRight.remove();
                    break;
                }
                deqRight.addFirst(deqRight.removeLast());
                right++;
            }

            if (left < right){
                deq = deqLeft;
                result = result + left;
            } else{
                deq = deqRight;
                result = result + right;
            }
        }
        System.out.println(result);
    }
}
