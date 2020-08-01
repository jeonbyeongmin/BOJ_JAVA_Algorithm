import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int n = newScanner.nextInt(); // N 킬로그램의 설탕
        int numberOfBag = 0; // 5키로 가방과 3키로 가방의 개수의 총합.
        int temp[] = {2, 3, 2, 3, 4};

        if (n < 8){ // 5와 3를 하나씩만 사용하여 만들 수 있는 최초의 수 8이하에서만 -1이 출력된다.
            if (n%3 != 0 && n%5 != 0){ // n < 8 중에서 3의 배수도 아니고 5의 배수도 아니라
                numberOfBag = -1; // 문제를 해결할 수 없으니 -1를 출력해준다.
            } else if (n%3 == 0){ // 3의 배수라면.
                for (int i = n; i > 0; i = i -3){
                    numberOfBag++;
                }
            } else if (n%5 == 0){ // 5의 배수라면.
                for (int i = n; i > 0; i = i -5){
                    numberOfBag++;
                }
            }
        } else{ // 8이상의 수라면 모두 5과 3의 조합으로 만들 수 있다.
            int i = n;
            int count = 0;
            while(i >= 13){
                i = i - 5;
                count ++;
            }
            numberOfBag = temp[i-8] + count;
        }
        System.out.println(numberOfBag);
    }
}


/* 3의 개수는 4를 넘을 수 없다. 5부터는 3*5는 15이기 때문에 5와 공배수 이기 때문... 5로 해결 가능하기 때문에 3은 항상 4까지만 나온다.

    1 = -1 3보다 작음.
    2 = -1 3보다 작음.
3 = 1 5*0 + 3*1
    4 = -1 5보다 작은데 3의 배수가 아님.
5 = 1 5*1 + 3*0
6 = 2 5*0 + 3*2
    7 = -1 3의 배수, 5의 배수가 아님.

8 = 5*1 + 3*1
9 = 5*0 + 3*3
10 = 5*2 + 3*0
11 = 5*1 + 3*2
12 = 5*0 + 3*4

13 = 5*2 + 3*1
14 = 5*1 + 3*3
15 = 5*3 + 3*0
16 = 5*2 + 3*2
17 = 5*1 + 3*4

18 = 5*3 + 3*1
19 = 5*2 + 3*3
20 = 5*4 + 3*0
21 = 5*3 + 3*2


배수로 접근X
5를 뺏을 때의 수로 접근?

우선 --> 5
차선책 --> 3 (만약 5를 뺏을 때 안되는 경우, 3으로 뺀다)?



 */
