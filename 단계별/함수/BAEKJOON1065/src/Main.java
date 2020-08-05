import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int givenNumber = newScanner.nextInt();
        int count = 0;


        for (int i = 1; i <= givenNumber; i++){
            if (d(i)){
                count++;
            }
        }
        System.out.print(count);

    }
    public static boolean d(int number){ // 해당 수가 한수(각 항이 등차수열을 이루는 수)인지 판단하는 함수

        boolean isRight = false;
        int one, two, three;

        if(1 <= number && number <= 99){
            isRight = true;
        } else if (99 < number && number < 1000){
            one = number/100;
            two = (number%100)/10;
            three = number%10;
            if (two - one == three - two){
                isRight = true;
            } else{
                isRight = false;
            }
        }

        return isRight;
    }
}
