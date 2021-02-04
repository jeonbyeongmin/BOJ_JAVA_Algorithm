import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2146 {
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

        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];                // 지도 배열 , 섬 각각을 인덱싱 해줄것
        int[][] bridge = new int[n][n];             // 다리 배열 , 섬을 BFS로 확장해가면
        Queue<Pair> queue = new LinkedList<>();     // 섬인서 공간의 좌표가 들어 가있는 큐

        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) queue.offer(new Pair(i, j));
                // 섬 각각을 인덱싱하여 map에 값을 다시 넣을 것이기 때문에 섬인 부분을 미리 큐에 넣어 두었다.
            }
        }
        int color = -1;
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map.length; j++) {
                if(map[i][j] == 1) {
                    color(map, i, j, color);        // map 각각 섬에 마이너스 수로 인덱싱..
                    color--;
                }
            }
        }
        System.out.println(bfs(map, bridge, queue));
    }
    public static void color(int[][] map, int x, int y, int color){
        map[x][y] = color;
        for (int i = 0; i < 4; i++){
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if (nextX >= 0 && nextX < map.length && nextY >= 0 && nextY < map.length){
                if (map[nextX][nextY] == 1) {
                    color(map, nextX, nextY, color);
                }
            }
        }
    }
    public static int bfs(int[][] map, int[][] bridge, Queue<Pair> queue){
        int min = Integer.MAX_VALUE;
        while(!queue.isEmpty()){
            Pair current = queue.poll();
            for (int i = 0; i < 4; i++){
                int nextX = current.x + dx[i];
                int nextY = current.y + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= map.length || nextY >= map.length) continue;
                if (map[nextX][nextY] == 0){
                    map[nextX][nextY] = map[current.x][current.y];
                    bridge[nextX][nextY] = bridge[current.x][current.y] + 1;
                    queue.offer(new Pair(nextX, nextY));
                } else if (map[nextX][nextY] != map[current.x][current.y]){
                    min = Math.min(min, bridge[nextX][nextY] + bridge[current.x][current.y]);
                }
            }
        }
        return min;
    }
}
