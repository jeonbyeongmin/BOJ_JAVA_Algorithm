import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int numberOfTest = newScanner.nextInt();
        String arr[] = new String[numberOfTest];


        for (int i = 0; i < numberOfTest; i++){ // test의 반복
            int numberOfLoop = newScanner.nextInt();
            String s = newScanner.next();
            String p = "";
            char temp;
            for (int j = 0; j < s.length(); j++){ //
                temp = s.charAt(j);
                for (int k = 0; k < numberOfLoop; k++){ // 글자의 반복
                    p = p + temp;
                }
            }
            arr[i] = p;
        }
        for (int i = 0; i < numberOfTest; i++){
            System.out.println(arr[i]);
        }
    }
}
