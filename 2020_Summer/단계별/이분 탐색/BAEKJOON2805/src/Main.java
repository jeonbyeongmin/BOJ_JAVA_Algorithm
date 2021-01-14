import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTrees = sc.nextInt(); // 나무의 수
        long m = sc.nextInt(); // 가져가려고하는 나무길의 총합
        long trees[] = new long[numberOfTrees];

        long max = 0;
        for (int i = 0; i < numberOfTrees; i++){
            trees[i] = sc.nextLong();
            max = Math.max(max, trees[i]);
        }

        long start = 0;
        long end = max;
        long result = 0;

        while(end - start >= 0){
            long mid = (start+end)/2;
            long sum = 0;
            for (int j = 0; j < trees.length; j++){
                if (trees[j] > mid){
                    sum = sum + (trees[j]-mid);
                }
            }
            if (sum < m){
                end = mid - 1;
            } else{
                result = Math.max(result, mid);
                start = mid + 1;
            }
        }
        System.out.println(result);

    }
}
