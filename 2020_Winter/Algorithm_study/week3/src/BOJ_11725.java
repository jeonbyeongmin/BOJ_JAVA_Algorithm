import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_11725 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer>[] graph = new ArrayList[n+1];
        for (int i = 1; i <= n; i++){
            graph[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++){
            int a = sc.nextInt(); int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }
        int[] parents = new int[n+1];
        dfs(graph, parents, 1, 0);
        for (int i = 2; i <= n; i++){
            System.out.println(parents[i]);
        }
    }
    public static void dfs(ArrayList<Integer>[] graph, int[] parents, int start, int parent){
        parents[start] = parent;
        for (int w : graph[start]) if (w != parent) dfs(graph, parents, w, start);
    }
}
