import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_1707 {
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

    public static boolean answer = true;

    public static void dfs(ArrayList<Integer>[] a, int[] color, int vertex, int flag){
        if (color[vertex] == 0) {
            color[vertex] = flag;

            for (int w : a[vertex]) {
                if (color[w] == flag) {    // color[vertex]와 color[w]가 같은 색상이면 이분 그래프가 될 수 없음
                    answer = false;
                } else if (color[w] == 0){
                    dfs(a, color, w, -flag);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            answer = true;
            AdjList adjList = new AdjList(n);
            int[] color = new int[n+1];

            for (int j = 0; j < m; j++){
                st = new StringTokenizer(br.readLine());
                adjList.setEdge(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }
            for (int j = 1; j <= n; j++){
                dfs(adjList.getGraph(), color, j, 1);
            }
            bw.write(answer ? "YES\n" : "NO\n");
        }
        bw.flush();
    }
}
