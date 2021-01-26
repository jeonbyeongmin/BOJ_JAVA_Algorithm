import java.io.*;
import java.util.Arrays;

public class BOJ_11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] card = new long[n];

        for (int i = 0; i < n; i++){
            card[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(card);

        int count = 1;
        int max = 1;
        long answer = card[0];

        for (int i = 1; i < n; i++){
            if (card[i] == card[i-1]){
                count++;
            } else {
                count = 1;
            }
            if (max < count){
                max = count;
                answer = card[i];
            }
        }
        System.out.println(answer);
    }
}
