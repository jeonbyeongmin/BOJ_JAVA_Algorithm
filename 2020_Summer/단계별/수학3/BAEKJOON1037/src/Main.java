import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int temp = sc.nextInt();
        int max = temp;
        int min = temp;

        for (int i = 1; i < N; i++){
            temp = sc.nextInt();
            max = Math.max(max, temp);
            min = Math.min(min, temp);
        }

        System.out.println(max*min);
    }
}
