import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int a = newScanner.nextInt(); // 고정비용
        int b = newScanner.nextInt(); // 가변비용
        int c = newScanner.nextInt(); // 판매비용

        int breakEvenPoint = 1;

        if (c-b > 0){ // 손익분기점이 존재한다면?
            while(a >= (c-b)*breakEvenPoint){ //같을 때에도 포함시켜야 '이득'이 나는 순간을 알 수 있다.
                breakEvenPoint++;
            }
        } else { // 손익분기점이 존재하지 않다면?
            breakEvenPoint = -1;
        }

        System.out.println(breakEvenPoint);

    }
}
