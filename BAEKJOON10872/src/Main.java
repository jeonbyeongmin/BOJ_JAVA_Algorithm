import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        System.out.println(fac(inputNumber));
    }
    static int fac(int a) {
        if (a == 0 || a== 1) {
            return 1;
        } else {
            return a * fac(a - 1);
        }
    }
}
