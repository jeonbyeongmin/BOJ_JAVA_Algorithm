import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();
        int count = 0;

        for (int i = 666; ; i++){
            String countNumber = "" + i;
            if (countNumber.contains("666")){
                count++;
            }
            if (count == inputNumber){
                System.out.println(countNumber);
                break;
            }
        }
    }
}

/********************************

 # THINKING

 666부터 숫자롤 1씩 올리며 반복문을 돌리고
 666이 나올때마다 count를 올린다.

 문제의 핵심은 해당 숫자에서
 666이 나오는 것을 어떻게
 알아낼 것이냐인데,

 나는 i는 int형으로 숫자를 올려주고
 그 숫자를 반복문 안에서 String으로 받아와
 contains를 이용해 그 문자열에 '666'이 있다면 count를 올려주었다.

 그리고 count == inputNumber라는 조건을 만족하면
 --> count에 해당하는 숫자를(반복문 안에서 문자열로 바꿔주었기 때문에 정확히는 문자열을)
 출력해주고 break를 하여 반복문을 빠져나오며 종료한다.

 ********************************/

