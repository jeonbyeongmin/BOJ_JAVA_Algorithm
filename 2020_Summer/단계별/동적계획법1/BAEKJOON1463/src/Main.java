import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int number[] = new int[Math.max(N+1, 4)];

        number[1] = 0;
        number[2] = 1;
        number[3] = 1;

        for (int i = 4; i <= N; i++){
            if ((i % 2 == 0) && (i % 3 != 0)){
                number[i] = Math.min(number[i/2], number[i-1]) + 1;
            } else if ((i % 3 == 0) && (i % 2 != 0)){
                number[i] = Math.min(number[i/3], number[i-1]) + 1;
            } else if ((i % 2 != 0) && (i % 3 != 0)){
                number[i] = number[i-1] + 1;
            } else{
                number[i] = Math.min(number[i/3], Math.min(number[i/2], number[i-1])) + 1;
            }
        }
        System.out.println(number[N]);
    }
}
