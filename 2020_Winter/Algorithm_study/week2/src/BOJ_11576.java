import java.util.Scanner;

public class BOJ_11576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // a진법
        int b = sc.nextInt(); // b진법

        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++){
            sb.append(Integer.toString(sc.nextInt(), a));
        }
        String answer = Integer.toString(Integer.parseInt(sb.toString(), a), b);
        for (int i = 0; i < answer.length(); i++){
            System.out.print(Integer.parseInt(Character.toString(answer.charAt(i)), b) + " ");
        }
    }
}
