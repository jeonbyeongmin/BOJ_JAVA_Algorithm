import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfLine = sc.nextInt();
        int line[] = new int[501];
        int result[] = new int[501];

        for (int i = 0; i < numberOfLine; i++){
            line[sc.nextInt()] = sc.nextInt();
        }
        int max = 1;
        for (int i = 1; i < 501; i++){
            if (line[i] > 0){
                result[i] = 1;
            }
            for (int j = 0; j <= i; j++){
                if (line[i] > line[j] && result[j]+1 > result[i]){
                    result[i] = result[j]+1;
                }
            }
            if (max < result[i]){
                max = result[i];
            }
        }
        int answer = numberOfLine - max;
        System.out.println(answer);
    }
}
