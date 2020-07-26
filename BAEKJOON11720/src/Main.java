import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // #BEAKJOON 11720 숫자의
        Scanner newScanner = new Scanner(System.in);
        int givenN = newScanner.nextInt();
        String n = newScanner.next();
        char a;
        int sum = 0;
        for (int i = 0; i < givenN; i++){
            sum = sum + (n.charAt(i)-'0');
        }
        System.out.print(sum);
    }
}
