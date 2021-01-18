import java.util.Scanner;

public class BOJ_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        String a = sc.next();

        int sum = 0;
        for (int i = 0; i < test; i++){
            sum += Character.getNumericValue(a.charAt(i));
        }
        System.out.println(sum);
    }
}
