import java.util.Scanner;

public class BOJ_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        int[] alphaCount = new int[26];

        for (int i = 0; i < line.length(); i++){
            alphaCount[line.charAt(i)-97]++;
        }
        for (int val : alphaCount){
            System.out.print(val + " ");
        }
    }
}
