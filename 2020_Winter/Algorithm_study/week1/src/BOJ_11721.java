import java.util.Scanner;

public class BOJ_11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int i = 0;

        while(i < a.length()){
            if (i%10 == 0 && i != 0){
                System.out.println();
            }
            System.out.print(a.charAt(i));
            i++;
        }
    }
}
