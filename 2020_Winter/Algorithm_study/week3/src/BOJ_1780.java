import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1780 {

    public static int count1 = 0;
    public static int count2 = 0;
    public static int count3 = 0;

    public static void cut(int[][] paper, int a, int b, int n) {
        if (n == 1) {
            if (paper[a][b] == -1) count1++;
            if (paper[a][b] == 0) count2++;
            if (paper[a][b] == 1) count3++;
        }
        else {
            if (check(paper, a, b, n)){
                if (paper[a][b] == -1) count1++;
                if (paper[a][b] == 0) count2++;
                if (paper[a][b] == 1) count3++;
            }
            else {
                int newSize = n/3;
                cut(paper, a, b, newSize);
                cut(paper, a, b + newSize, newSize);
                cut(paper, a, b + 2*newSize, newSize);
                cut(paper, a + newSize, b, newSize);
                cut(paper, a + newSize, b + newSize, newSize);
                cut(paper, a + newSize, b + 2*newSize, newSize);
                cut(paper, a + 2*newSize, b, newSize);
                cut(paper, a + 2*newSize, b + newSize, newSize);
                cut(paper, a + 2*newSize, b + 2*newSize, newSize);
            }
        }
    }
    public static boolean check(int[][] paper, int a, int b, int n) {
        for (int i = a; i < a+n; i++){
            for (int j = b; j < b+n; j++){
                if (paper[a][b] != paper[i][j]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] paper = new int[n+1][n+1];

        for (int i = 1; i <= n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) paper[i][j] = Integer.parseInt(st.nextToken());
        }
        cut(paper, 1, 1, n);
        bw.write(count1 + "\n" + count2 + "\n" + count3);
        bw.flush();
        bw.close();
    }
}
