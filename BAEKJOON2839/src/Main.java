import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int n = newScanner.nextInt(); // N 킬로그램의 설탕
        int numberOfBag = 0;

        while(n >= 5){
            for (int i = n; i > 0; i = i/3)
            if (3의 배수이지만 5의 배수는 아닌 수라면){
                break;
            }
            numberOfBag++;
            n = n-5;
        }

        while(n >= 3){
            numberOfBag++;
            n = n-3;
        }

        if (n > 0){
            numberOfBag = -1;
        }

        System.out.println(numberOfBag);
    }
}
