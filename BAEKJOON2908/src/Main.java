import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        String a = newScanner.next();
        String b = newScanner.next();

        String sangsuA = "" ;
        String sangsuB = "";

        for (int i = 1; i <= 3; i++) {
            sangsuA = sangsuA + a.charAt(3 - i);
            sangsuB = sangsuB + b.charAt(3 - i);
        }

        if (Integer.valueOf(sangsuA) < Integer.valueOf(sangsuB)){
            System.out.println(sangsuB);
        } else if (Integer.valueOf(sangsuA) > Integer.valueOf(sangsuB)){
            System.out.println(sangsuA);
        }

    }
}
