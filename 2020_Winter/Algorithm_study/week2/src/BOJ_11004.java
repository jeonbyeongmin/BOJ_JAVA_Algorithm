import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line, " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] numb = new int[n];

        String numbs = br.readLine();
        st = new StringTokenizer(numbs, " ");

        for (int i = 0 ; i < n; i++){
            numb[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numb);
        System.out.println(numb[k-1]);
    }
}
