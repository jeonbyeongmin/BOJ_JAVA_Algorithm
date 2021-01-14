
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < K; i++){
            int inputNumber = sc.nextInt();
            if (inputNumber == 0){
                list.pop();
            } else {
                list.push(inputNumber);
            }
        }

        int sum = 0;
        for (int temp : list){
            sum = sum + temp;
        }
        System.out.println(sum);

    }
}
