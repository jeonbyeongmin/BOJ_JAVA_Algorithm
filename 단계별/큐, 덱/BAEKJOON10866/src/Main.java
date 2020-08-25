import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Deque<Integer> deq = new ArrayDeque<>();

        for (int i = 0; i < N; i++){
            String str = sc.next();
            switch (str){
                case "push_front" :
                    deq.addFirst(sc.nextInt());
                    break;
                case "push_back" :
                    deq.addLast(sc.nextInt());
                    break;
                case "pop_front" :
                    if (deq.isEmpty()){
                        System.out.println("-1");
                    } else{
                        System.out.println(deq.removeFirst());
                    }
                    break;
                case "pop_back" :
                    if (deq.isEmpty()){
                        System.out.println("-1");
                    } else{
                        System.out.println(deq.removeLast());
                    }
                    break;
                case "size" :
                    System.out.println(deq.size());
                    break;
                case "empty" :
                    if (deq.isEmpty()){
                        System.out.println("1");
                    } else{
                        System.out.println("0");
                    }
                    break;
                case "front" :
                    if (deq.isEmpty()) {
                        System.out.println("-1");
                    } else{
                        System.out.println(deq.getFirst());
                    }
                    break;
                case "back" :
                    if (deq.isEmpty()){
                        System.out.println("-1");
                    } else{
                        System.out.println(deq.getLast());
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
