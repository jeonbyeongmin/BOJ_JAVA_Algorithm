import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_2606 {

    static Scanner sc = new Scanner(System.in);
    static int numberOfComputer = sc.nextInt();
    static int edge = sc.nextInt();
    static int[][] graph = new int[numberOfComputer+1][numberOfComputer+1];
    static boolean[] visit = new boolean[numberOfComputer+1];

    public static void main(String[] args) {

        for (int i = 0; i < edge; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = graph[b][a] = 1;
        }

        System.out.println(bfs(1, numberOfComputer));
    }

    public static int bfs(int start, int N){

        Queue<Integer> queue = new LinkedList<>();
        int answer = 0;

        queue.offer(start);

        while(!queue.isEmpty()){
            int temp = queue.poll();
            visit[temp] = true;
            answer++;
            for (int i = 1; i <= N; i++){
                if (graph[i][temp] == 1 && !visit[i]){
                    queue.offer(i);
                    visit[i] = true;
                }
            }
        }

        return answer-1;
    }
}
