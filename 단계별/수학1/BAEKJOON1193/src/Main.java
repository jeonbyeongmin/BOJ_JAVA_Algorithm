import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int inputNumber = newScanner.nextInt();
        System.out.println(result(inputNumber));
    }
    public static String result(int x){
        String result = "";
        int count = 0;
        int sum = 0;
        int right, left;
        for (int i = x; i > 0; i = i - count){ // 1. 홀수 인지 파악. 2. 입력받은 숫자가 존재하는 줄 바로 직전의 줄까지 총 몇 개가 있는 지?
            count++;
            sum = sum + (count -1);
        }
        if (count%2 == 0){ // count가 짝수라면?
            left = x-sum;
            right = count - left + 1;
        } else{ // 홀수라면?
            right = x-sum;
            left = count - right +1;
        }
        result = left + "/" + right;
        return result;
    }
}
