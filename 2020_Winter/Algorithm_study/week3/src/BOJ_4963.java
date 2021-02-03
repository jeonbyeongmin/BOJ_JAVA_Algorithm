import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_4963 {
    public static int count = 0;
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
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            if (w == 0 && h == 0) break;

            int[][] map = new int[h][w];
            boolean[][] visit = new boolean[h][w];

            for (int i = 0; i < h; i++){
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            count = 0;
            for (int i = 0; i < h; i++){
                for (int j = 0; j < w; j++){
                    if (map[i][j] == 1 && !visit[i][j]) {
                        bfs(map, visit, new Pair(i, j));
                        count++;
                    }
                }
            }
            bw.write(Integer.toString(count) + "\n");
        }
        bw.flush();
        bw.close();
    }
    public static void bfs(int[][] map, boolean[][] visit, Pair vertex){
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(vertex);

        while(!queue.isEmpty()){
            Pair pair = queue.poll();
            if (pair.x < 0 || pair.y < 0 || pair.x >= map.length || pair.y >= map[0].length) continue;
            if (map[pair.x][pair.y] == 1 && !visit[pair.x][pair.y]){
                visit[pair.x][pair.y] = true;

                queue.offer(new Pair(pair.x-1, pair.y-1)); // 서북
                queue.offer(new Pair(pair.x, pair.y-1)); // 북
                queue.offer(new Pair(pair.x+1, pair.y-1)); // 동북
                queue.offer(new Pair(pair.x+1, pair.y)); // 동
                queue.offer(new Pair(pair.x+1, pair.y+1)); // 동남
                queue.offer(new Pair(pair.x, pair.y+1)); // 남
                queue.offer(new Pair(pair.x-1, pair.y+1)); // 서남
                queue.offer(new Pair(pair.x-1, pair.y)); // 서
            }
        }
    }
}
