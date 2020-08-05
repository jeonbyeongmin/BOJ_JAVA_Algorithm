
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int card[] = new int[n];
        for (int i = 0; i < n; i++){
            card[i] = sc.nextInt();
        }

        int min = m - card[0] + card[1] + card[2];

        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                for (int k = j+1; k < n; k++){
                    int newMin = m - (card[i] + card[j] + card[k]);
                    if (newMin < min &&  newMin >= 0){
                        min = newMin;
                    }
                }
            }
        }
        int result = m - min;
        System.out.println(result);
    }
}

