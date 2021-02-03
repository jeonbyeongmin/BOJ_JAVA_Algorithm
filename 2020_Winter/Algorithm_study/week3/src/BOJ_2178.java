import java.io.*;
import java.util.*;

public class BOJ_2178 {
    public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, 1, -1};
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

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];
        boolean[][] visit = new boolean[n][m];

        for (int i = 0; i < n; i++){
            String line = br.readLine();
            for (int j = 0; j < m; j++){
                map[i][j] = Character.getNumericValue(line.charAt(j));
            }
        }
        bfs(map, visit, new Pair(0, 0));
        System.out.println(map[n-1][m-1]);
    }
    public static void bfs(int[][] map, boolean[][] visit, Pair pair){
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(pair);

        while(!queue.isEmpty()){
            Pair current = queue.poll();
            visit[current.x][current.y] = true;

            for (int i = 0; i < 4; i++){
                int nextX = current.x + dx[i];
                int nextY = current.y + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= map.length || nextY >= map[0].length) continue;
                if (map[nextX][nextY] == 1 && !visit[nextX][nextY]){
                    map[nextX][nextY] = map[current.x][current.y] + 1;
                    queue.offer(new Pair(nextX, nextY));
                }
            }
        }
    }
}
