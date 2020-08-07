import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count[] = new int[10001]; // 0 ~ 10000 까지 10001가 나올 수 있다.

        for (int i = 0; i < n; i++){
            count[Integer.parseInt(br.readLine())]++; // 각각의 숫자가 나올 때마다 해당 인덱스를 카운팅 해줄 것.
        }
        for (int i = 0; i < count.length; i++){
            while(count[i] > 0){
                bw.write(Integer.toString(i) + "\n");
                count[i]--;

            }
        }

        bw.close();
    }

}
