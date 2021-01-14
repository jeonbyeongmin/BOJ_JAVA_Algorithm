import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputN = sc.nextInt();
        int[] tempArr = new int[inputN];
        for (int i = 0; i < inputN; i++){
            int temp = sc.nextInt();
            tempArr[i] = temp;
        }
        Arrays.sort(tempArr);
        int answer = 0;
        for (int i = 0; i < inputN; i++){
            if (answer < tempArr[i]*(inputN-i)){
                answer = tempArr[i] * (inputN-i);
            }
        }
        System.out.println(answer);
    }
}
