import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_2667 {
    public static List<Integer> list = new ArrayList<>();
    public static class Pair {
        private int x;
        private int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] graph = new int[n][n];
        boolean[][] visit = new boolean[n][n];

        for (int i = 0; i < n; i++){
            String line = br.readLine();
            for (int j = 0; j < n; j++){
                graph[i][j] = Character.getNumericValue(line.charAt(j));
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (graph[i][j] == 1 && !visit[i][j]){
                    bfs(graph, new Pair(i, j), visit);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for (int val : list) System.out.println(val);
    }
    public static void bfs(int[][] graph, Pair pair, boolean[][] visit){
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(pair);
        int count = 0;

        while(!queue.isEmpty()){
            Pair newPair = queue.poll();
            if (newPair.x < 0 || newPair.y < 0 || newPair.x >= graph.length || newPair.y >= graph.length) continue;
            if (graph[newPair.x][newPair.y] == 1 && !visit[newPair.x][newPair.y]) {

                count++;
                visit[newPair.x][newPair.y] = true;

                queue.offer(new Pair(newPair.x+1, newPair.y)); // 우
                queue.offer(new Pair(newPair.x, newPair.y+1)); // 하
                queue.offer(new Pair(newPair.x-1, newPair.y)); // 좌
                queue.offer(new Pair(newPair.x, newPair.y-1)); // 상
            }
        }
        list.add(count);
    }
}
