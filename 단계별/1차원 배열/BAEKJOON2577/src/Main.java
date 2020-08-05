import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int a = newScanner.nextInt();
        int b = newScanner.nextInt();
        int c = newScanner.nextInt();

        int arr[] = new int[10];
        int result = a*b*c;
        int temp;
        while(result > 0) {
            for (int i = 0; i < 10; i++){
                temp = result%10;
                if(temp == i){
                    arr[i] = arr[i] + 1;
                }
            }
            result = result/10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
