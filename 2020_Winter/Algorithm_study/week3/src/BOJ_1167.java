import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_1167 {
    public static class Vertex {
        int vertex;
        int distance;
        public Vertex(int vertex, int distance){
            this.vertex = vertex;
            this.distance = distance;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int v = Integer.parseInt(br.readLine());
        ArrayList<Vertex>[] graph = new ArrayList[v+1];
        int[] distances = new int[v+1];
        boolean[] visit = new boolean[v+1];

        for (int i = 1; i <= v; i++){
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < v; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            while(v2 != -1) {
                int distance = Integer.parseInt(st.nextToken());
                graph[v1].add(new Vertex(v2, distance));
                graph[v2].add(new Vertex(v1, distance));
                v2 = Integer.parseInt(st.nextToken());
            }
        }

        dfs(graph, distances, visit, 1);

        int max = 0, index = 0;
        for (int i = 1; i <= v; i++){
            if (max < distances[i]) {
                max = distances[i];
                index = i;
            }
        }

        distances = new int[v+1];
        visit = new boolean[v+1];
        dfs(graph, distances, visit, index);

        max = 0;
        for (int val : distances) max = Math.max(max, val);
        System.out.println(max);
    }
    public static void dfs(ArrayList<Vertex>[] graph, int[] distance, boolean[] visit, int current){
        visit[current] = true;
        for (Vertex w : graph[current]) {
            if (!visit[w.vertex]){
                distance[w.vertex] = w.distance + distance[current];
                dfs(graph, distance, visit, w.vertex);
            }
        }
    }
}
