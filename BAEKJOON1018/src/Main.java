import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        char case_1[][] = new char[n][m]; // 첫번째 칸이 W인 경우.
        char case_2[][] = new char[n][m]; // 첫번째 칸이 B인 경우.

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if ((i+1)%2 != 0) {
                    if ((j+1) % 2 != 0){
                        case_1[i][j] = 'W';
                        case_2[i][j] = 'B';
                    } else{
                        case_1[i][j] = 'B';
                        case_2[i][j] = 'W';
                    }
                } else{
                    if ((j+1) % 2 != 0){
                        case_1[i][j] = 'B';
                        case_2[i][j] = 'W';
                    } else{
                        case_1[i][j] = 'W';
                        case_2[i][j] = 'B';
                    }
                }
            }
        }

        char testCase[][] = new char[n][m];
        char temp[] = new char[m];
        for (int i = 0; i < n; i++){ // 값을 받아오는 for문.
            String test = sc.next();
            for (int j = 0; j < m; j++){
                for (int k = 0; k < n; k++){
                    temp[k] = test.charAt(k);
                }
                testCase[i][j] = temp[j];
            }
        }

        int count_1 = 0;
        int count_2 = 0;

        int newI = 0;
        int newJ = 0;


        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (case_1[i][j] != testCase[i][j]){
                    count_1++;
                }
                if (case_2[i][j] != testCase[i][j]){
                    count_2++;
                }
            }
        }


        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(case_1[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(case_2[i][j]);
            }
            System.out.println();
        }
        System.out.println(count_1);
        System.out.println(count_2);

        if (count_1 <= count_2){
            System.out.println(count_1);
        } else{
            System.out.println(count_2);
        }
    }
}
