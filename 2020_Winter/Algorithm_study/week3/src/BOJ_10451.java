import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_10451 {
    public static class Adjlist {
        private ArrayList<Integer>[] adjlist;
        public Adjlist(int initSize) {
            adjlist = new ArrayList[initSize+1];
            for (int i = 0; i <= initSize; i++){
                adjlist[i] = new ArrayList<Integer>();
            }
        }
        public ArrayList<Integer>[] getGraph(){
            return adjlist;
        }
        public ArrayList<Integer> getNode(int vertexIndex){
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
    public static int count = 0;
    public static void bfs(ArrayList<Integer>[] graph, boolean[] visit, int vertex){
        Queue<Integer> queue = new LinkedList<>();

        if (!visit[vertex]){
            queue.offer(vertex);
            visit[vertex] = true;
        }

        while(!queue.isEmpty()) {
            int newVertex = queue.poll();
            for (int w : graph[newVertex]){
                if (visit[w]){
                    count++;
                }
                else {
                    queue.offer(w);
                    visit[w] = true;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            Adjlist adjlist = new Adjlist(N);
            boolean[] visit = new boolean[N+1];
            count = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++){
                adjlist.setEdgeSingle(j, Integer.parseInt(st.nextToken()));
            }
            for (int j = 1; j <= N; j++){
                bfs(adjlist.getGraph(), visit, j);
            }
            bw.write(Integer.toString(count) + "\n");
        }
        bw.flush();
    }

}
