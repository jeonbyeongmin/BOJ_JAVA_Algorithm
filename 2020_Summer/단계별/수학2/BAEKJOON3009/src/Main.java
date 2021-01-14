import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x[] = new int[3];
        int y[] = new int[3];

        int newX = 0;
        int newY = 0;
        for (int i = 0; i < 3; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++){
            if (isExist(x, x[i]) == 1){
                newX = x[i];
            }
            if (isExist(y, y[i]) == 1){
                newY = y[i];
            }
        }
        System.out.println(newX + " " + newY);

    }
    static int isExist(int a[], int b){ // a 배열 안에 b라는 숫자가 몇개 있는지?
        int count = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] == b){
                count++;
            }
        }
        return count;
    }
}
