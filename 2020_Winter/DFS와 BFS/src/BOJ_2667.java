import java.util.*;

public class BOJ_2667 {

    static Scanner scanner = new Scanner(System.in);
    static int N = scanner.nextInt();
    static int[][] map = new int[N][N];
    static boolean[][] visit = new boolean[N][N];
    static List<Integer> list = new ArrayList<>();

    public static class Pair {
        private int x;
        private int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
        public void setX(int x) {
            this.x = x;
        }
        public void setY(int y) {
            this.y = y;
        }
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < N; i++){    // input
            String line = scanner.next();
            for (int j = 0; j < N; j++){
                map[i][j] = Character.getNumericValue(line.charAt(j));
            }
        }

        for (int i = 0; i < N; i++){    // bfs 함수 호출
            for (int j = 0; j < N; j++){
                if (!visit[i][j] && map[i][j] == 1){
                    Pair newPair = new Pair(i, j);
                    bfs(newPair);
                }
            }
        }

        Collections.sort(list);

        System.out.println(list.size());
        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
    public static void bfs(Pair newPair){
        int count = 0;
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(newPair);

        while(!queue.isEmpty()){
            Pair pair = queue.poll();

            if (pair.getX() < 0 || pair.getY() < 0 || pair.getX() >= N || pair.getY() >= N){
                continue;
            }
            if (map[pair.getX()][pair.getY()] == 0){
                continue;
            }
            if (visit[pair.getX()][pair.getY()]) {
                continue;
            }

            count++;
            visit[pair.getX()][pair.getY()] = true;

            queue.offer(new Pair(pair.getX()+1, pair.getY()));
            queue.offer(new Pair(pair.getX(), pair.getY()+1));
            queue.offer(new Pair(pair.getX()-1, pair.getY()));
            queue.offer(new Pair(pair.getX(), pair.getY()-1));
        }
        list.add(count);
    }


}
