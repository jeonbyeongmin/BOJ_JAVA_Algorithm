import java.util.Scanner;

public class BOJ_11655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        for (int i = 0; i < line.length(); i++){
            if (line.charAt(i) <= 122 && line.charAt(i) >= 97){
                if (line.charAt(i) + 13 > 122){
                    System.out.print((char)(line.charAt(i) - 13));
                } else {
                    System.out.print((char)(line.charAt(i) + 13));
                }
            }
            else if (line.charAt(i) <= 90 && line.charAt(i) >= 65) {
                if (line.charAt(i) + 13 > 90){
                    System.out.print((char)(line.charAt(i) - 13));
                } else {
                    System.out.print((char)(line.charAt(i) + 13));
                }
            }
            else {
                System.out.print(line.charAt(i));
            }
        }
    }
}
