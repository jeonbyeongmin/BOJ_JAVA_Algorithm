import java.io.*;
import java.util.*;

public class BOJ_1260 {

    public static class AdjacencyMatrix {
        private final int[][] a;
        public AdjacencyMatrix(int initSize) {
            this.a = new int[initSize+1][initSize+1];
        }
        public int[][] getGraph(){
            return a;
        }
        public void setEdge(int vertex1, int vertex2){
            a[vertex1][vertex2] = a[vertex2][vertex1] = 1;
        }
        public void setEdgeSingle(int vertex1, int vertex2){
            a[vertex1][vertex2] = 1;
        }
        public void printGraph() {
            for (int[] ints : a) {
                for (int anInt : ints) {
                    System.out.print(anInt + " ");
                }
                System.out.println();
            }
        }
    }

    public static class AdjacentList {
        private final ArrayList<Integer>[] a;
        public AdjacentList(int initSize) {
            this.a = new ArrayList[initSize+1];
            for (int i = 0; i <= initSize; i++){
                a[i] = new ArrayList<>();
            }
        }
        public ArrayList<Integer>[] getGraph(){
            return a;
        }
        public ArrayList<Integer> getVertex(int vertexIndex){
            return a[vertexIndex];
        }
        public void setEdge(int vertex1, int vertex2){
            a[vertex1].add(vertex2);
            a[vertex2].add(vertex1);
        }
        public void setEdgeSingle(int vertex1, int vertex2){
            a[vertex1].add(vertex2);
        }
        public void print(){
            for (ArrayList<Integer> nodes : a){
                for (int val : nodes){
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
    }

    public static void dfs_adjacencyMatrix(int[][] a, boolean[] visit, int vertex){
        visit[vertex] = true;
        System.out.print(vertex + " ");
        for (int i = 1; i <= a.length-1; i++){
            if (a[vertex][i] == 1 && !visit[i]) dfs_adjacencyMatrix(a, visit, i);
        }
    }
    public static void dfs_adjacentList(ArrayList<Integer>[] a, boolean[] visit, int vertex){
        visit[vertex] = true;
        System.out.print(vertex + " ");

        for (int w : a[vertex]) {
            if (!visit[w]) dfs_adjacentList(a, visit, w);
        }
    }
    public static void bfs_adjacencyMatrix(int[][] a, boolean[] visit, int vertex){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(vertex);
        visit[vertex] = true;

        while(!queue.isEmpty()){
            int newVertex = queue.poll();
            System.out.print(newVertex + " ");
            for (int i = 1; i <= a.length-1; i++){
                if (a[newVertex][i] == 1 && !visit[i]) {
                    queue.offer(i);
                    visit[i] = true;
                }
            }
        }
    }
    public static void bfs_adjacentList(ArrayList<Integer>[] a, boolean[] visit, int vertex){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(vertex);
        visit[vertex] = true;

        while(!queue.isEmpty()){
            int newVertex = queue.poll();
            System.out.print(newVertex + " ");
            for (int w : a[newVertex]) {
                if (!visit[w]) {
                    queue.offer(w);
                    visit[w] = true;
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        boolean[] dfs_visit = new boolean[n+1];
        boolean[] bfs_visit = new boolean[n+1];

        AdjacencyMatrix adjacencyMatrix = new AdjacencyMatrix(n);   // 인접행렬을 이용한 방법
//        AdjacentList adjacentList = new AdjacentList(n);             // 인접리스트를 이용한 방법

        for (int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int vertex1 = Integer.parseInt(st.nextToken());
            int vertex2 = Integer.parseInt(st.nextToken());
            adjacencyMatrix.setEdge(vertex1, vertex2);
//            adjacentList.setEdge(vertex1, vertex2);
        }

//        for (int i = 0; i <= n; i++){
//            Collections.sort(adjacentList.getVertex(i));
//        }

        dfs_adjacencyMatrix(adjacencyMatrix.getGraph(), dfs_visit, v);
        System.out.println();
        bfs_adjacencyMatrix(adjacencyMatrix.getGraph(), bfs_visit, v);

//        dfs_adjacentList(adjacentList.getGraph(), dfs_visit, v);
//        System.out.println();
//        bfs_adjacentList(adjacentList.getGraph(), bfs_visit, v);
    }
}
