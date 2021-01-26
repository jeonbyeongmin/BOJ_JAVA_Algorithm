import java.util.Scanner;
import java.util.Stack;

public class BOJ_9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++){
            Stack<Character> stack = new Stack<>();
            String str = sc.next();
            for (int j = 0; j < str.length(); j++){
                if (str.charAt(j) == '('){
                    stack.push(str.charAt(j));
                }
                else if (str.charAt(j) == ')'){
                    if (!stack.isEmpty() && stack.firstElement() == '(') {
                        stack.pop();
                    } else {
                        stack.push(str.charAt(j));
                        break;
                    }
                }
            }
            if (stack.isEmpty()){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
