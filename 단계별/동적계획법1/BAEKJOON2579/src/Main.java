
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStairs = sc.nextInt();
        int staris[] = new int[numberOfStairs];
        int result[] = new int[numberOfStairs];

        for (int i = 0; i < numberOfStairs; i++){
            staris[i] = sc.nextInt();
        }

        if (numberOfStairs==1){
            System.out.println(staris[0]);
        } else if (numberOfStairs ==2){
            System.out.println(staris[0]+staris[1]);
        } else if (numberOfStairs == 3){
            System.out.println(Math.max(staris[0]+staris[2], staris[1]+staris[2]));
        } else{
            result[0] = staris[0];
            result[1] = staris[0]+staris[1];
            result[2] = Math.max(staris[0]+staris[2], staris[1]+staris[2]);

            for (int i = 3; i < numberOfStairs; i++){
                result[i] = Math.max((staris[i]+staris[i-1]+result[i-3]), (staris[i]+result[i-2]));
            }
            System.out.println(result[numberOfStairs-1]);
        }
    }
}
