import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCase = sc.nextInt();

        int oneCount[] = new int[41];
        int zeroCount[] = new int[41];

        oneCount[0] = 0;
        oneCount[1] = 1;
        zeroCount[0] = 1;
        zeroCount[1] = 0;
        for (int i = 2; i < 41; i++){
            oneCount[i] = oneCount[i-1] + oneCount[i-2];
            zeroCount[i] = zeroCount[i-1] + zeroCount[i-2];
        }

        for (int i = 0; i < numberOfCase; i++){
            int testCase = sc.nextInt();
            System.out.println(zeroCount[testCase] + " " + oneCount[testCase]);
        }
    }

}
