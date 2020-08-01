import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int inputNumber = newScanner.nextInt();
        int count = 0;
        if (inputNumber == 1){
            count = 0;
        } else{
            for (int i = inputNumber-1; i > 0; i = i - 6*count){
                count++;
            }
        }
        System.out.println(count+1);
    }
}