import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_1260 {

    static Scanner sc = new Scanner(System.in);
    static int N = sc.nextInt();
    static int M = sc.nextInt();
    static int V = sc.nextInt();
    static int[][] graph = new int[N+1][N+1];
    static boolean[] visit = new boolean[N+1];

    public static void main(String[] args) {

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = graph[b][a] = 1;
        }

        dfs(V, N);
        System.out.println();

        visit = new boolean[N+1];
        bfs(V, N);
    }

    public static void bfs(int start, int N){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        while(!queue.isEmpty()){
            int temp = queue.poll();
            visit[temp] = true;
            System.out.print(temp + " ");
            for (int i = 1; i <= N; i++){
                if (graph[i][temp] == 1 && !visit[i]){
                    queue.offer(i);
                    visit[i] = true;
                }
            }
        }
    }

    public static void dfs(int start, int N){
        if (visit[start]){
            return;
        }

        visit[start] = true;
        System.out.print(start + " ");
        for (int i = 1; i <= N; i++){
            if (graph[i][start] == 1){
                dfs(i, N);
            }
        }
    }
}
