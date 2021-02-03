import java.io.*;
import java.util.*;

public class BOJ_9466 {

    public static int count = 0;    // 팀을 형성한 인원의 수
    public static boolean[] done;   // 사이클을 형성하는 놈인지, 형성하지 못한 놈인지 확인을 끝내면 true로 바뀜 (재방문했다면 사이클을 형성한 것)
    public static boolean[] visit;  // 방문시 true, 단 다음 루프의 dfs를 위해서 dfs가 끝날 때마다 초기화한다.
    public static void dfs(int[] graph, int currentVertex){
        if (visit[currentVertex]){              // 재방문했다는 뜻이므로 true로 바꿔주고 count를 1 증가시킴
            done[currentVertex] = true; count++;
        }
        else visit[currentVertex] = true;        // 처음 방문하는 것


        int nextVertex = graph[currentVertex];
        if (!done[nextVertex]) dfs(graph, nextVertex);  // 다음 놈이 팀을 이룰 수 있는 놈인지 아닌지 판단을 아직 안했다면 dfs를 돌아줌

        visit[currentVertex] = false;   // dfs가 끝났으니 초기화한다.
        done[currentVertex] = true;

        // 사이클을 이루지 못한 놈들 중에 이번 dfs에 가담했던 놈들은 전부 팀을 이루지 못하는 놈들이라는 판단을 할 수 있기 때문에 dfs가 끝날때 전부다 true로 바꿔준다.
        // 만약 다음 dfs에서 다시 이 녀석들을 만난다면 어차피 이 녀석들은 뭔짓을 해도 팀을 이룰 수 없는 놈들이기 때문에 안타깝지만 이번 놈도 팀을 이루지 못한다.
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine());
            int[] graph = new int[n+1];
            done = new boolean[n+1];
            visit = new boolean[n+1];
            count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++){
                graph[j] = Integer.parseInt(st.nextToken());
            }
            for (int j = 1; j <= n; j++){
                if (!done[j]) dfs(graph, j);
            }
            bw.write(Integer.toString(n-count)+ "\n");
        }
        bw.flush();
    }
}
