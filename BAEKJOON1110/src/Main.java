import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int n = newScanner.nextInt();
        int count = 0;
        int a = n/10; // --> 2
        int b = n%10; // --> 6
        int c = -1;
        while(c != n){
            int sum = a+b; // --> 8
            a = b; // --> 6
            b = sum%10; // --> 8
            count++;
            c = a*10+b;
        }
        System.out.println(count);
    }
}
