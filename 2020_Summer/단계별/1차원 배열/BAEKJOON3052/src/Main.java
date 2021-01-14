import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int a[] = new int[10];
        int temp;
        int count = 0;
        for(int i = 0; i < 10; i++){
            temp = newScanner.nextInt();
            a[i] = temp%42;
        }
        for(int i = 0; i < 10; i++){
            boolean isExist = false;
            for (int j = i+1; j < 10; j++){
                if (a[i] == a[j]){
                     isExist = true;
                 }
            }
            if (isExist == false){
                count++;
            }
        }
        System.out.print(count);
    }
}
