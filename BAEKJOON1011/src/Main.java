import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfTestCase = sc.nextInt();

        for (int i = 0; i < numberOfTestCase; i++){
            int currentPosition = sc.nextInt();
            int targetPosition = sc.nextInt();

            int distance = targetPosition-currentPosition; // 거리 구하기
            int max = (int)Math.sqrt(distance);

            if (max == Math.sqrt(distance)){
                System.out.println(max*2-1);
            } else if (distance <= max * max + max){
                System.out.println(max*2);
            } else{
                System.out.println(max*2+1);
            }
        }
    }
}

/*

count       distance        max         move
1           1               1           1
2           2               1           11
3           3               2           111

3           4               2           121
4           5               2           1211
4           6               2           1221
5           7               2           12211
5           8               2           12221

5           9               3           12321


--> distance의 제곱근은 max...
 */