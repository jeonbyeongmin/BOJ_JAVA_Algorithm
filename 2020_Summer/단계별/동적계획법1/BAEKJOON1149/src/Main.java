import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int rgb[][] = new int[T][3]; // R, G, B 세 개의 색깔을 두번째 배열 인덱스로 접근할 것.

        for (int i = 0; i < T; i++){
            rgb[i][0] = sc.nextInt(); // RED
            rgb[i][1] = sc.nextInt(); // GREEN
            rgb[i][2] = sc.nextInt(); // BLUE
        }

        for (int i = 1; i < T; i++){
            rgb[i][0] += Math.min(rgb[i-1][1], rgb[i-1][2]);
            rgb[i][1] += Math.min(rgb[i-1][0], rgb[i-1][2]);
            rgb[i][2] += Math.min(rgb[i-1][0], rgb[i-1][1]);
        }

        System.out.println(Math.min(rgb[T-1][0], Math.min(rgb[T-1][1], rgb[T-1][2])));
    }
}
