import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        System.out.println(Math.PI * radius * radius);
        System.out.println((double) 2 * radius * radius);
    }
}
