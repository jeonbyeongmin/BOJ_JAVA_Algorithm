import java.io.*;
import java.util.*;

public class BOJ_11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] A = new int[n + m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n ; i++) A[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = n; i < n+m ; i++) A[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(A);
        for (int val : A) bw.write(Integer.toString(val) + " ");
        bw.flush();
        bw.close();
    }
}
