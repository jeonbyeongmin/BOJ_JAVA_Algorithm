import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        String input = newScanner.next();
        String croatia[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < croatia.length; i++){
            if (input.contains(croatia[i])){
                input = input.replaceAll(croatia[i], "*");
            }
        }
        System.out.println(input.length());
    }
}
