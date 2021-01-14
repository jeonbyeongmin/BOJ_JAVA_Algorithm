import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputN = sc.nextInt();
        int temp = 1000-inputN;
        int count = 0;
        while(temp != 0){
            if (temp - 500 >= 0){
                temp = temp - 500;
                count++;
            } else if (temp - 100 >= 0){
                temp = temp - 100;
                count++;
            } else if (temp - 50 >= 0){
                temp = temp - 50;
                count++;
            } else if (temp - 10 >= 0){
                temp = temp - 10;
                count++;
            } else if (temp - 5 >= 0){
                temp = temp - 5;
                count++;
            } else {
                temp = temp - 1;
                count++;
            }
        }
        System.out.println(count);
    }
}
