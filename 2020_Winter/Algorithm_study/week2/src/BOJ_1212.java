import java.util.Scanner;

public class BOJ_1212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        System.out.print(Integer.toString(Character.getNumericValue(line.charAt(0)),2));
        for (int i = 1; i < line.length(); i++){
            if (Character.getNumericValue(line.charAt(i)) == 0){
                System.out.print("000");
            } else if (Character.getNumericValue(line.charAt(i)) == 1){
                System.out.print("001");
            } else if (Character.getNumericValue(line.charAt(i)) == 2) {
                System.out.print("010");
            } else if (Character.getNumericValue(line.charAt(i)) == 3) {
                System.out.print("011");
            } else{
                System.out.print(Integer.toString(Character.getNumericValue(line.charAt(i)),2));
            }
        }
    }
}
