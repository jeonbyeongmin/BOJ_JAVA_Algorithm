import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class BOJ_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0 ; i < n; i++){
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line, " ");
            switch (st.nextToken()){
                case "push" :
                    queue.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    if (queue.isEmpty()){
                        System.out.println("-1");
                    } else {
                        System.out.println(queue.poll());
                    }
                    break;
                case "size" :
                    System.out.println(queue.size());
                    break;
                case "empty" :
                    if (queue.isEmpty()){
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                    break;
                case "front" :
                    if (queue.isEmpty()){
                        System.out.println("-1");
                    } else {
                        System.out.println(queue.getFirst());
                    }
                    break;
                case "back" :
                    if (queue.isEmpty()){
                        System.out.println("-1");
                    } else {
                        System.out.println(queue.getLast());
                    }
                    break;
            }
        }
    }
}
