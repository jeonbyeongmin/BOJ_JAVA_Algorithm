import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        String inputStr = newScanner.next();
        int count[] = new int[10]; // 0~9까지 번호가 몇번 눌렸는지 세기 위한 배열
        int timeSum = 0;

        for (int i = 0; i < inputStr.length(); i++){
            if (inputStr.charAt(i) == 'A' || inputStr.charAt(i) == 'B' || inputStr.charAt(i) == 'C') {
                timeSum = timeSum + 3;
            } else if (inputStr.charAt(i) == 'D' || inputStr.charAt(i) == 'E' || inputStr.charAt(i) == 'F') {
                timeSum = timeSum + 4;
            } else if (inputStr.charAt(i) == 'G' || inputStr.charAt(i) == 'H' || inputStr.charAt(i) == 'I') {
                timeSum = timeSum + 5;
            } else if (inputStr.charAt(i) == 'J' || inputStr.charAt(i) == 'K' || inputStr.charAt(i) == 'L') {
                timeSum = timeSum + 6;
            } else if (inputStr.charAt(i) == 'M' || inputStr.charAt(i) == 'N' || inputStr.charAt(i) == 'O') {
                timeSum = timeSum + 7;
            } else if (inputStr.charAt(i) == 'P' || inputStr.charAt(i) == 'Q' || inputStr.charAt(i) == 'R' || inputStr.charAt(i) == 'S') {
                timeSum = timeSum + 8;
            } else if (inputStr.charAt(i) == 'T' || inputStr.charAt(i) == 'U' || inputStr.charAt(i) == 'V') {
                timeSum = timeSum + 9;
            } else if (inputStr.charAt(i) == 'W' || inputStr.charAt(i) == 'X' || inputStr.charAt(i) == 'Y' || inputStr.charAt(i) == 'Z') {
                timeSum = timeSum + 10;
            }
        }
        System.out.println(timeSum);
    }
}
