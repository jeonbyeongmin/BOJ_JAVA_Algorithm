import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_1967 {
    public static class Vertex {
        int vertex, distance;
        public Vertex(int vertex, int distance){
            this.vertex = vertex;
            this.distance = distance;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n == 1){
            System.out.println(0);
            return;
        }

        ArrayList<Vertex>[] graph = new ArrayList[n+1];
        boolean[] visit = new boolean[n+1];
        int[] distance = new int[n+1];

        for (int i = 1; i <= n; i++){
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < n-1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            graph[parent].add(new Vertex(child, weight));
            graph[child].add(new Vertex(parent, weight));
        }

        dfs(graph, visit, distance, 1);
        int max = 0, index = 0;
        for (int i = 1; i <= n; i++) {
            if (max < distance[i]){
                max = distance[i];
                index = i;
            }
        }
        visit = new boolean[n+1];
        distance = new int[n+1];
        dfs(graph, visit, distance, index);

        max = 0;
        for (int val : distance){
            max = Math.max(max, val);
        }
        System.out.println(max);
    }
    public static void dfs(ArrayList<Vertex>[] graph, boolean[] visit, int[] distance, int current){
        visit[current] = true;
        for (Vertex w : graph[current]){
            if (!visit[w.vertex]) {
                distance[w.vertex] = w.distance + distance[current];
                dfs(graph, visit, distance, w.vertex);
            }
        }
    }
}
