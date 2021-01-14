import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCase = sc.nextInt();

        for (int i = 0; i < numberOfCase; i++){
            int floor = sc.nextInt(); // 층
            int n = sc.nextInt(); // 호
            int numberOfPeople[] = new int[14];
            for (int j = 0; j < 14; j++){
                numberOfPeople[j] = j+1;
            }
            for (int k = 0; k < floor; k++){
                for (int j = 1; j < n; j++){
                    numberOfPeople[j] = numberOfPeople[j-1] + numberOfPeople[j];
                }
            }
            System.out.println(numberOfPeople[n-1]);
        }
    }
}