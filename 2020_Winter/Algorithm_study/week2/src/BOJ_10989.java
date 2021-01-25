import java.io.*;

public class BOJ_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] num = new int[10001];

        for (int i = 0; i < n; i++){
            num[Integer.parseInt(br.readLine())]++;
        }
        for (int i = 1; i <= 10000; i++){
            for (int j = num[i]; j > 0; j--){
                bw.write(Integer.toString(i) + "\n");
            }
        }
        bw.close();
    }
}
