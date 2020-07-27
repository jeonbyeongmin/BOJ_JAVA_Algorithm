import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        String croatiaAlpha = newScanner.next();
        int count = 1;

        for (int i = 1; i < croatiaAlpha.length(); i++){
            count++;
            if ((croatiaAlpha.charAt(i-1) == 'c' && croatiaAlpha.charAt(i) == '-') || (croatiaAlpha.charAt(i-1) == 'c' && croatiaAlpha.charAt(i) == '=') || (croatiaAlpha.charAt(i-1) == 'd' && croatiaAlpha.charAt(i) == '-') || (croatiaAlpha.charAt(i-1) == 'l' && croatiaAlpha.charAt(i) == 'j') || (croatiaAlpha.charAt(i-1) == 'n' && croatiaAlpha.charAt(i) == 'j') || (croatiaAlpha.charAt(i-1) == 's' && croatiaAlpha.charAt(i) == '=') || (croatiaAlpha.charAt(i-1) == 'z' && croatiaAlpha.charAt(i) == '=')) {
                count --;
            } else if (croatiaAlpha.charAt(i-1) == 'd' && croatiaAlpha.charAt(i) == 'z' && croatiaAlpha.charAt(i+1) == '='){
                count = count -2;
            }
        }
        System.out.println(count);
    }
}
