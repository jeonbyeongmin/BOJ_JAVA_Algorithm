import java.util.Scanner;

public class BOJ_1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < month; i++){
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12){
                sum += 31;
            }
            else if (i == 4 || i == 6 || i == 9 || i == 11){
                sum += 30;
            }
            else {
                sum += 28;
            }
        }
        sum += day;
        int rem = sum % 7;

        switch (rem){
            case 1 :
                System.out.println("MON");
                break;
            case 2 :
                System.out.println("TUE");
                break;
            case 3 :
                System.out.println("WED");
                break;
            case 4 :
                System.out.println("THU");
                break;
            case 5 :
                System.out.println("FRI");
                break;
            case 6 :
                System.out.println("SAT");
                break;
            case 0 :
                System.out.println("SUN");
                break;
            default:
                break;
        }

    }
}
