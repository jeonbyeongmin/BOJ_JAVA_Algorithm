import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_2668 {
    public static boolean[] visit;
    public static boolean[] done;
    public static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] graph = new int[n+1];
        visit = new boolean[n+1];
        done = new boolean[n+1];

        for (int i = 1; i <= n; i++) graph[i] = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) if (!done[i]) dfs(graph, i);

        Collections.sort(list);
        bw.write(Integer.toString(list.size()) + "\n");
        for (int val : list) bw.write(Integer.toString(val) + "\n");

        bw.flush();
        bw.close();
    }
    public static void dfs(int[] graph, int vertex){
        if (visit[vertex]){
            done[vertex] = true;
            list.add(vertex);
        } else {
            visit[vertex] = true;
        }
        int nextVertex = graph[vertex];
        if (!done[nextVertex]) dfs(graph, nextVertex);
        visit[vertex] = false;
        done[vertex] = true;
    }
}
