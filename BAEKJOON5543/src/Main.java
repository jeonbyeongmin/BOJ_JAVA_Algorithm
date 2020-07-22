import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int a[] = new int[3];
        int b[] = new int[2];

        a[0] = newScanner.nextInt();

        int cheapburger = a[0];
        for(int i = 1; i < 3; i++){
            a[i] = newScanner.nextInt();
            if(a[i] < cheapburger){
                cheapburger = a[i];
            }
        }

        b[0] = newScanner.nextInt();
        int cheapdrink = b[0];
        for(int i = 1; i < 2; i++){
            b[i] = newScanner.nextInt();
            if (b[i] < cheapdrink){
                cheapdrink = b[i];
            }
        }
        System.out.print(cheapburger+cheapdrink-50);
    }
}
