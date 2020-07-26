import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        char givenChar = newScanner.next().charAt(0);
        byte a = (byte) givenChar;
        System.out.print(a);
    }

}
