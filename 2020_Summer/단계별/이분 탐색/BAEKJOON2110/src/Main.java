import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 집의 개수
        int c = sc.nextInt(); // 공유기의 개수
        int[] loc = new int[n]; // 집의 좌표

        for (int i = 0; i < n; i++){
            loc[i] = sc.nextInt();
        }

        Arrays.sort(loc);

        int left = 1;
        int right = loc[n-1] - loc[0];
        int result = 0;
        while(right-left >= 0){
            int mid = (right+left)/2; // 예상 두 공유기 사이의 거리
            int count = 1; // 공유기 설치 개수
            int loc_j = loc[0];

            for (int i = 1; i < n; i++){
                // 순차적으로 실제 두 공유기 사이의 거리와
                // 예상 거리 (mid)를 비교하기 위해서
                int d = loc[i]-loc_j; // 실제 두 공유기 사이의 거리
                if (d >= mid){
                    count++;
                    loc_j = loc[i];
                }
            }

            if (count >= c){ // mid 만큼 띄워서 설치한 공유기의 개수가 c를 넘어섰다면?
                result = mid;
                left = mid + 1; // 예상 거리를 늘려 다시 루프를 돌린다
            } else{
                right = mid - 1;
            }
        }
        System.out.println(result);
    }
}
