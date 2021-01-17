import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_1012 {

    static Scanner sc = new Scanner(System.in);
    static int testCase = sc.nextInt();
    static int[][] map;
    static boolean[][] visit;

    public static class Pair {

        private int x;
        private int y;

        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
        public void setY(int y) {
            this.y = y;
        }
        public void setX(int x) {
            this.x = x;
        }
        public int getY() {
            return y;
        }
        public int getX() {
            return x;
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < testCase; i++){

            int M = sc.nextInt();   // 가로 길이
            int N = sc.nextInt();   // 세로 길이
            int K = sc.nextInt();   // 배추의 개수

            map = new int[M][N];    // 가로 X 세로
            visit = new boolean[M][N];

            for (int j = 0; j < K; j++){ // create map
                int x = sc.nextInt();   // 가로
                int y = sc.nextInt();   // 세로
                map[x][y] = 1;
            }

            int numberOfWorms = 0;

            for (int x = 0; x < M; x++){
                for (int y = 0; y < N; y++){
                    if (!visit[x][y] && map[x][y] == 1) {
                        bfs(new Pair(x, y), M, N);
                        numberOfWorms++;
                    }

                }
            }
            System.out.println(numberOfWorms);
        }
    }
    public static void bfs(Pair pair, int M, int N){
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(pair);

        while(!queue.isEmpty()){
            Pair newPair = queue.poll();

            if (newPair.getX() < 0 || newPair.getY() < 0 || newPair.getX() >= M || newPair.getY() >= N){
                continue;
            }
            if (visit[newPair.getX()][newPair.getY()]){         // 이미 방문한 node
                continue;
            }
            if (map[newPair.getX()][newPair.getY()] == 0){
                continue;
            }

            visit[newPair.getX()][newPair.getY()] = true;
            queue.offer(new Pair(newPair.getX()+1, newPair.getY()));
            queue.offer(new Pair(newPair.getX()-1, newPair.getY()));
            queue.offer(new Pair(newPair.getX(), newPair.getY()+1));
            queue.offer(new Pair(newPair.getX(), newPair.getY()-1));

        }
    }
}
