import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int a[] = new int[3];
        int largest = 0;
        int second = 0;
        for (int i = 0; i < 3; i++){
            a[i] = newScanner.nextInt();
            if(largest < a[i]){
                second = largest;
                largest = a[i];
            } else if (second < a[i]){
                second = a[i];
            }
        }
        System.out.print(second);
    }
}
