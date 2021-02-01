import java.io.*;
import java.util.*;

public class BOJ_11724 {
    public static class AdjList {
        ArrayList<Integer>[] adjlist;
        public AdjList(int initSize) {
            adjlist = new ArrayList[initSize+1];
            for (int i = 1; i <= initSize; i++){
                adjlist[i] = new ArrayList<>();
            }
        }
        public ArrayList<Integer>[] getGraph(){
            return adjlist;
        }
        public ArrayList<Integer> getVertex(int vertexIndex){
            return adjlist[vertexIndex];
        }
        public void setEdge(int v1, int v2){
            adjlist[v1].add(v2);
            adjlist[v2].add(v1);
        }
        public void setEdgeSingle(int v1, int v2){
            adjlist[v1].add(v2);
        }
    }
    public static int bfs(ArrayList<Integer>[] graph, boolean[] visit, int vertex){
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;

        if (!visit[vertex]){
            queue.offer(vertex);
            count++;
        }

        visit[vertex] = true;
        while(!queue.isEmpty()){
            int newVertex = queue.poll();
            for (int i : graph[newVertex]){
                if (!visit[i]) {
                    queue.offer(i);
                    visit[i] = true;
                }
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        AdjList adjList = new AdjList(n);
        boolean[] visit = new boolean[n+1];

        for (int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            adjList.setEdge(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        int count = 0;
        for (int i = 1; i <= n; i++){
            if (bfs(adjList.getGraph(), visit, i) != 0){
                count++;
            }
        }
        bw.write(Integer.toString(count) + "\n");
        bw.flush();
    }
}
