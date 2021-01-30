import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class BOJ_2089 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        if (num == 0){
            System.out.println(0);
            return;
        }
        while(num != 1){
            if (num < 0) {
                if (num%-2 != 0){
                    stack.push(1);
                    num = num/-2 + 1;
                } else {
                    stack.push(0);
                    num = num/-2;
                }
            } else if (num > 0){
                if (num%-2 != 0){
                    stack.push(1);
                    num = num/-2;
                } else {
                    stack.push(0);
                    num = num/-2;
                }
            }
        }
        stack.push(1);
        while(!stack.isEmpty()){
            bw.write(Integer.toString(stack.pop()));
        }
        bw.flush();
    }
}
