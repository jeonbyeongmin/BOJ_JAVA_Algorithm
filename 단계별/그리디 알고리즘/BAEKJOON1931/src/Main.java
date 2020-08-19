import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] time = new int[N][2];

        for (int i = 0; i < N; i++){
            time[i][0] = sc.nextInt();
            time[i][1] = sc.nextInt();
        }
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]){
                    return Integer.compare(o1[0], o2[0]);
                }
                return Integer.compare(o1[1], o2[1]);
            }
        });

        int temp = -1;
        int count = 0;
        for (int i = 0; i < N; i++){
            if (temp <= time[i][0]){
                count++;
                temp = time[i][1];
            }
        }
        System.out.println(count);
    }
}
