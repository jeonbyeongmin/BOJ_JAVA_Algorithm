import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int weight[] = new int[number];
        int stature[] = new int[number];


        for (int i = 0; i < number; i++){
            weight[i] = sc.nextInt();
            stature[i] = sc.nextInt();
        }

        for (int i = 0; i < number; i++){
            int rank = 1;
            for (int j = 0; j < number; j++){
                if (weight[i] < weight[j] && stature[i] < stature[j]){
                    rank++;
                }
            }
            System.out.print(rank+ " ");
        }
    }
}