import java.util.Scanner;

public class BOJ_10824 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String d = sc.next();

        System.out.println(Long.parseLong(a+b) + Long.parseLong(c+d));
    }
}
