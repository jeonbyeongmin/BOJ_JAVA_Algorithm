import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // n의 생성자를 구하는 프로그램을 작성해야한다.
        int count = 0; //몇의 자리 숫자?
        for (int i = n; i > 0; i = i/10){
            count ++;
        }
        int temp = 0;
        int number[] = new int[count];
        for (int i = 0; i < count; i++){
            temp = temp + 9; // N이 만약 1의 자리 수이면 temp 9이다.
        }

        int limit = n - temp;
        int result = 0;
        for (int i = limit; i < n; i++){ // 생성자가 있더라도, limit ~ n 까지에 존재할 것이이다.
            int tempForI = i;
            for (int j = 0; j < count; j++){
                int divideN = 1;
                for (int k = count-j-1; k > 0; k--){
                    divideN = divideN * 10;
                }
                number[j] = tempForI/divideN;
                tempForI = tempForI % divideN;
            }
            int sum = i;
            for (int j = 0; j < count; j++){
                sum = sum + number[j];
            }
            if (n == sum) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}

/*************************************

# THINKING

다짜고짜 256이라는 숫자를 받았다.
우리는 256의 생성자가 있을지 없을지는 아직 모르더라도,
있다면 256은 "??? + 0~9 + 0~9 + 0~9" 으로 만들어졌을 것이기 때문에
'???'는 반드시 219~256 사이에 존재하겠구나라는 아이디어를 얻을 수 있다.


그럼 일단 0~9라는 숫자의 개수는 우리가 받은 숫자 256이 몇의 자리 숫자인지 파악해야한다.
256은 백의 자리 숫자이기 때문에 0~9는 3개가 있을 것이다.


(단, 예외는 받은 숫자가 1000이라면 생성자가 무조건 백의자리 숫자라는 것..
 속도는 조금 느려지겠지만 정교한 문제풀이는 아니지만 문제를 구하는 것에는 지장을 주지 않는다.)


아무튼, 219~256까지 문제에서는 '답'이라고 표현하는 목표값.즉 256을 만드는 계산을 통해
256과 일치하는 것이 있다면 생성자가 있는 것이고
256과 일치하는 것이 없다면 생성자가 없는 것이다.


생성자가 있는 경우에는, 생성자가 여러개가 있을 수 있는데
이럴 때에는 문제에서 가장 작은 생성자를 출력하라고 하였으니
작은 생성자를 찾자마자 break를 하여 해당 값을 출력할 것이다.

***************************************/
