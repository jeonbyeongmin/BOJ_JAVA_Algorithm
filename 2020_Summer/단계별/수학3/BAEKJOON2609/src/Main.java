import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();

        int max = Math.max(one, two);
        int min = Math.min(one, two);
        int commonFactor = 1;
        for (int i = 2; i <= min; i++){
            if (one % i == 0 && two % i == 0){
                commonFactor = i;
            }
        }

        int commonMultiple;
        for (int i = max;;i++){
            if (i % one == 0 && i % two == 0) {
                commonMultiple = i;
                break;
            }
        }
        System.out.println(commonFactor);
        System.out.println(commonMultiple);
    }
}
