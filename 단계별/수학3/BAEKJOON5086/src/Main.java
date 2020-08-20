import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one;
        int two;

        while(true){
            one = sc.nextInt();
            two = sc.nextInt();

            if (one == 0 && two == 0){
                break;
            }

            if (one % two == 0){
                System.out.println("multiple");
            } else if (two % one == 0){
                System.out.println("factor");
            } else {
                System.out.println("neither");
            }

        }
    }
}
