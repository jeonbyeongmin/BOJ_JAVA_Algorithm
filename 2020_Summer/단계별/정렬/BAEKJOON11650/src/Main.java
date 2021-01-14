import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNumber = Integer.parseInt(br.readLine());
        int xy[][] = new int[inputNumber][2];

        String[] str = new String[2];
        for (int i = 0; i < inputNumber; i++){
            str = br.readLine().split(" ");
            xy[i][0] =Integer.parseInt(str[0]);
            xy[i][1] = Integer.parseInt(str[1]);
        }

        Arrays.sort(xy, new Comparator<int[]>() {
            @Override
            public int compare(int[] x, int[] y) {
                if (x[0] == y[0]) {
                    return Integer.compare(x[1], y[1]);
                }
                return Integer.compare(x[0], y[0]);
            }

        });

        for (int i = 0; i < inputNumber; i++){
            System.out.print(xy[i][0] + " ");
            System.out.println(xy[i][1]);
        }

    }
}
