import java.util.Scanner;

public class BOJ_2004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int temp;

        int twoCount_1 = 0, twoCount_2 = 0, twoCount_3 = 0;
        int fiveCount_1 = 0, fiveCount_2 = 0, fiveCount_3 = 0;

        temp = n;
        while(temp / 5 >= 1){
            temp /= 5;
            fiveCount_1 += temp;
        }
        temp = n;
        while(temp / 2 >= 1){
            temp /= 2;
            twoCount_1 += temp;
        }

        temp = m;
        while(temp / 5 >= 1){
            temp /= 5;
            fiveCount_2 += temp;
        }
        temp = m;
        while(temp / 2 >= 1){
            temp /= 2;
            twoCount_2 += temp;
        }

        temp = n-m;
        while(temp / 5 >= 1){
            temp /= 5;
            fiveCount_3 += temp;
        }
        temp = n-m;
        while(temp / 2 >= 1){
            temp /= 2;
            twoCount_3 += temp;
        }
        System.out.println(Math.min(twoCount_1-twoCount_2-twoCount_3, fiveCount_1-fiveCount_2-fiveCount_3));
    }
}
