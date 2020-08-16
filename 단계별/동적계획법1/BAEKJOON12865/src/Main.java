import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfItem = sc.nextInt();
        int possibleWeight = sc.nextInt();
        int item[][] = new int[numberOfItem+1][possibleWeight+1];

        int weight[] = new int[numberOfItem+1];
        int value[] = new int[numberOfItem+1];

        for (int i = 1; i <= numberOfItem; i++) {
            weight[i] = sc.nextInt(); // 무게
            value[i] = sc.nextInt(); // 가치
        }

        for (int i = 1; i <= numberOfItem; i++){ // 어떤 item?
            for (int j = 1; j <= possibleWeight; j++){ // 어떤 무게?
                item[i][j] = item[i-1][j];
                if (j >= weight[i]) {
                    item[i][j] = Math.max(item[i-1][j], item[i-1][j-weight[i]] + value[i]);
                }
            }
        }
        System.out.println(item[numberOfItem][possibleWeight]);
    }
}
