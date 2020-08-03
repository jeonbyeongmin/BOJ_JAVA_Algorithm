import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();


            if (a+b+c == 0){
                break;
            }
            if (isRight(a, b, c)){
                System.out.println("right");
            } else{
                System.out.println("wrong");
            }
        }
    }
    static boolean isRight(int a, int b, int c){
        int maxNumber;
        if (a > b){
            if (a > c){ //a가 최대값
                maxNumber = a;
            }else{ // c가 최대값
                maxNumber = c;
            }
        } else{
            if (b > c){ // b가 최대값
                maxNumber = b;
            } else{ // c가 최대값
                maxNumber = c;
            }
        }

        if (maxNumber == a){
            if (b*b + c*c == a*a){
                return true;
            }
        } else if (maxNumber == b){
            if (a*a + c*c == b*b){
                return true;
            }
        } else{
            if (a*a + b*b == c*c){
                return true;
            }
        }
        return false;
    }
}
