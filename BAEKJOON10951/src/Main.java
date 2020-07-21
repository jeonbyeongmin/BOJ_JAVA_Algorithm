import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int a = newScanner.nextInt();
        int b = newScanner.nextInt();
        System.out.println(a+b);
        while(newScanner.hasNextInt()){
            a = newScanner.nextInt();
            b = newScanner.nextInt();

            System.out.println(a+b);

        }
    }
}