import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int twoCount = 0;
        int fiveCount = 0;

        int temp = n;
        while(temp >= 1){
            twoCount = twoCount + temp / 2;
            temp = temp / 2;
        }

        temp = n;
        while(temp >= 1){
            fiveCount = fiveCount + temp / 5;
            temp = temp / 5;
        }

        int twoCount_2 = 0;
        int fiveCount_2 = 0;

        temp = m;
        while(temp >= 1){
            twoCount_2 = twoCount_2 + temp / 2;
            temp = temp / 2;
        }

        temp = m;
        while(temp >= 1){
            fiveCount_2 = fiveCount_2 + temp / 5;
            temp = temp / 5;
        }

        int twoCount_3 = 0;
        int fiveCount_3 = 0;

        temp = n-m;
        while(temp >= 1){
            twoCount_3 = twoCount_3 + temp / 2;
            temp = temp / 2;
        }


        temp = n-m;
        while(temp >= 1){
            fiveCount_3 = fiveCount_3 + temp / 5;
            temp = temp / 5;
        }

        int min = Math.min(twoCount-(twoCount_2+twoCount_3), fiveCount-(fiveCount_2 + fiveCount_3));
        System.out.print(min);
    }
}
