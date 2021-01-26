import java.util.Scanner;
import java.util.Stack;

public class BOJ_10799 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();

        Stack<Character> stack = new Stack<>();
        int stickCount = 0;
        int answer = 0;

        for (int i = 0; i < line.length(); i++){
            stack.push(line.charAt(i));
            if (line.charAt(i) == '('){
                stickCount++;
            }
            if (line.charAt(i) == ')'){
                stickCount--;
                if (line.charAt(i-1) == '('){
                    answer += stickCount;
                } else {
                    answer += 1;
                }
            }
        }
        System.out.println(answer);
    }
}
