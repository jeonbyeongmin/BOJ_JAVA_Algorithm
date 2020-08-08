import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNumber = Integer.parseInt(br.readLine());
        int xy[][] = new int[inputNumber][2];
        String  str[] = new String[2];
        for (int i = 0; i < inputNumber; i++){
            str = br.readLine().split(" ");

            xy[i][0] = Integer.parseInt(str[0]);
            xy[i][1] = Integer.parseInt(str[1]);

        }

        Arrays.sort(xy, (e1, e2) -> {
            if (e1[1] == e2[1]){
                return e1[0] - e2[0];
            } else{
                return e1[1] - e2[1];
            }
        });

        for (int i = 0; i < inputNumber; i++) {
            System.out.println(xy[i][0] + " " + xy[i][1]);
        }
    }
}
