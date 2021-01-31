import java.util.Scanner;

public class BOJ_11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int number = sc.nextInt();

        int i = 2;
        while(number != 1){
            if (number % i == 0){
                sb.append(i).append("\n");
                number /= i;
            } else {
                i++;
            }
        }
        System.out.println(sb);
    }
}
