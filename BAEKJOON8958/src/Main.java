import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int n = newScanner.nextInt();
        String str[] = new String[n];

        char prevChar;
        char currentChar;

        for (int i = 0; i < n; i++){
            str[i] = newScanner.next();
        }

        for (int i = 0; i < n; i++){
            int count = 1;
            int sum = 0;
            if (str[i].charAt(0) == 'O'){
                sum = sum + count;
            }
            for (int j = 1; j < str[i].length(); j++){
                prevChar = str[i].charAt(j-1);
                currentChar = str[i].charAt(j);
                if (prevChar == 'O' && currentChar == 'O'){
                    count++;
                    sum = sum + count;
                } else if (prevChar == 'X' && currentChar == 'O'){
                    sum++;
                } else if (prevChar == 'O' && currentChar == 'X'){
                    count = 1;
                }
            }
            System.out.println(sum);
        }
    }
}