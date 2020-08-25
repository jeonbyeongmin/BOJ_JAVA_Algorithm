import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++){ // test case
            int N = sc.nextInt(); // 문서는 총 몇개?
            int M = sc.nextInt(); // 몇번째 문서?
            LinkedList<Integer> list = new LinkedList<>();
            for (int j = 0; j < N; j++){
                list.add(sc.nextInt()); // 문서마다 중요도는?
            }

            list.


        }
    }
}
