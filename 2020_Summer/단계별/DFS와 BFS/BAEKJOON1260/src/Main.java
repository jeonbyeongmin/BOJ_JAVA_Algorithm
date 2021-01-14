import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int map[][];
    static boolean[] visit;
    static int n, m, v;

    // 깊이 우선 탐색 (Depth First Search) :: 재귀함수 이용하기
    public static void dfs(int i){
        visit[i] = true;
        System.out.print(i + " ");
        for (int j = 1; j < n+1; j++){
            if (map[i][j] == 1 && !visit[j]){
                dfs(j);
            }
        }
    }

    // 너비 우선 탐색 (Breadth First Search) :: 큐 이용하기
    public static void bfs(int i){
        Queue<Integer> que = new LinkedList<Integer>();
        que.add(i);
        visit[i] = true;

        while(!que.isEmpty()){
            i = que.poll();
            System.out.print(i + " ");
            for (int j = 1; j < n+1; j++){
                if (map[i][j] == 1 && !visit[j]){
                    que.offer(j);
                    visit[j] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();

        map = new int[n+1][n+1];
        visit = new boolean[n+1];

        int num1, num2;

        for (int i = 1; i <=m; i++){
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            map[num1][num2] = map[num2][num1] = 1;
        }
        dfs(v);
        for (int i = 1; i <= n; i++){
            visit[i] = false;
        }
        System.out.println();
        bfs(v);


    }
}
