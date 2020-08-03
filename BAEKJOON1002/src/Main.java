import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfCase = sc.nextInt();
        for (int i = 0; i < numberOfCase; i++){
            int x_1 = sc.nextInt();
            int y_1 = sc.nextInt();
            int r_1 = sc.nextInt();
            int x_2 = sc.nextInt();
            int y_2 = sc.nextInt();
            int r_2 = sc.nextInt();
            System.out.println(numberOfPosition(x_1, y_1, r_1, x_2, y_2, r_2));
        }
    }
    static int numberOfPosition(int x_1, int y_1, int r_1, int x_2, int y_2, int r_2){
        double centerDistance = Math.sqrt((Math.abs(x_1-x_2) * Math.abs(x_1-x_2)) + (Math.abs(y_1-y_2) * Math.abs(y_1-y_2)));
        if (r_1+r_2 == centerDistance || Math.abs(r_1 - r_2) == centerDistance) { // 두 원의 반지름이 한 점에서 만나는 경우
            if (x_1 == x_2 && y_1  == y_2 && r_1 == r_2){
                return -1;
            } else{
                return 1;
            }
        } else if (r_1 + r_2 > centerDistance && centerDistance > Math.abs(r_1 - r_2)){ // 두 원의 반지름이 두 점에서 만나는 경
            return 2;
        } else {
            return 0;
        }
    }
}

//(r_1 + r_2 < centerDistance || centerDistance < Math.abs(r_1 - r_2))
