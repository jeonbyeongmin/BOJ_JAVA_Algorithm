
import java.io.*;
import java.util.*;

public class BOJ_1168 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken()) -1;

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            list.add(i);
        }

        int index = 0;
        sb.append("<");
        for (int i = 0; i < n-1; i++){
            index += k;

            if (index >= list.size()){
                index %= list.size();
            }
            sb.append(list.remove(index)).append(", ");
        }
        sb.append(list.remove(0)).append(">");
        bw.write(sb.toString() + "\n");
        bw.flush();
    }
}
