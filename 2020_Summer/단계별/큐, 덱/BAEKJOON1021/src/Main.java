
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        List<Integer> deq = new ArrayList<>();

        for (int i = 1; i <= N; i++){
            deq.add(i);
        }

        int result = 0;

        for (int i = 0; i < M; i++){
            int number = sc.nextInt();

            while(deq.get(0) != number){
                if (deq.indexOf(number) > deq.size()/2){
                    deq.add(0, deq.remove(deq.size()-1));
                } else{
                    deq.add(deq.size()-1, deq.remove(0));
                }
                result++;
            }
            deq.remove(0);
        }
        System.out.println(result);
    }
}
