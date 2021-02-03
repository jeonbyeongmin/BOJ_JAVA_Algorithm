import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_7576 {
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static class Pair {
        int x;
        int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[][] box = new int[n][m];

        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++){
                box[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bfs(box);

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, box[i][j]);
            }
        }
        System.out.println(max - 1);
    }
    public static void bfs(int[][] graph){
        Queue<Pair> queue = new LinkedList<>();

        for (int i = 0; i < graph.length; i++){
            for (int j = 0; j < graph[0].length; j++){
                if (graph[i][j] == 1) {
                    queue.offer(new Pair(i, j));
                }
            }
        }

        while(!queue.isEmpty()){
            Pair current = queue.poll();
            for (int i = 0; i < 4; i++){
                int nextX = current.x + dx[i];
                int nextY = current.y + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= graph.length || nextY >= graph[0].length) continue;
                if (graph[nextX][nextY] != 0) continue;
                graph[nextX][nextY] = graph[current.x][current.y]+1;
                queue.offer(new Pair(nextX, nextY));
            }
        }
    }
}
