import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();




        /********************************
         1. testCase와 비교할 두가지 버전 정답지 만들기.
         ********************************/

        char answer_W[][] = new char[8][8]; // 첫번째 칸이 W인 경우의 정답지.
        char answer_B[][] = new char[8][8]; // 첫번째 칸이 B인 경우의 정답지.

        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if ((i+1)%2 != 0) {
                    if ((j+1) % 2 != 0){
                        answer_W[i][j] = 'W';
                        answer_B[i][j] = 'B';
                    } else{
                        answer_W[i][j] = 'B';
                        answer_B[i][j] = 'W';
                    }
                } else{
                    if ((j+1) % 2 != 0){
                        answer_W[i][j] = 'B';
                        answer_B[i][j] = 'W';
                    } else{
                        answer_W[i][j] = 'W';
                        answer_B[i][j] = 'B';
                    }
                }
            }
        }





        /********************************
         2. testCase 사용자에게 받아오기.
         ********************************/

        char testCase[][] = new char[n][m];
        char temp[] = new char[m];
        for (int i = 0; i < n; i++){ // 값을 받아오는 for문.
            String test = sc.next(); //String으로 받아와서 하나하나 temp 배열에 넣어줄 것.
            for (int j = 0; j < m; j++){
                for (int k = 0; k < m; k++){
                    temp[k] = test.charAt(k);
                }
                testCase[i][j] = temp[j]; // temp배열에 넣었던 것들 하나하나 testCase속으로...
            }
        }





        /*********************************************
         3. 두개의 정답지와 testCase를 경우의 수 별로 비교하여.
            값이 틀리면 count_W와 count_B를 올려준다.
         *********************************************/

        int resultOfCase[][] = new int[n-8+1][m-8+1];
        for (int startingPointI = 0; startingPointI <= n-8; startingPointI++){
            for (int startingPointJ = 0; startingPointJ <= m-8; startingPointJ++){

                int count_W = 0;
                int count_B = 0;

                for (int i = 0; i < 8; i++){

                    for (int j = 0; j < 8; j++){
                        if (answer_W[i][j] != testCase[i + startingPointI][j + startingPointJ]){
                            count_W++;
                        }
                        if (answer_B[i][j] != testCase[i + startingPointI][j + startingPointJ]){
                            count_B++;
                        }
                    }
                }

                if (count_W <= count_B){
                    resultOfCase[startingPointI][startingPointJ] = count_W;
                } else{
                    resultOfCase[startingPointI][startingPointJ] = count_B;
                }
            }
        }

        int minOfResult = n*m;

        for (int startingPointI = 0; startingPointI <= n-8; startingPointI++){
            for (int startingPointJ = 0; startingPointJ <= m-8; startingPointJ++){
                if (minOfResult > resultOfCase[startingPointI][startingPointJ]){
                    minOfResult = resultOfCase[startingPointI][startingPointJ];
                }
            }
        }

        System.out.println(minOfResult);

    }
}
