import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        String givenStr = newScanner.nextLine();
        int count = 1;
        for (int i = 0; i < givenStr.length(); i++){
            if (givenStr.charAt(i) == ' ') {
                count ++;
            }
        }
        if (givenStr.charAt(0) == ' '){
            count--;
        }
        if (givenStr.charAt(givenStr.length()-1) == ' '){
            count --;
        }
        System.out.println(count);
    }
}
