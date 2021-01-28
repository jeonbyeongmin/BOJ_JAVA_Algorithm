import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        int m = Integer.parseInt(br.readLine());

        Stack<String> leftStack = new Stack<>();
        Stack<String> rightStack = new Stack<>();

        for (int i = 0; i < line.length(); i++){
            leftStack.push(Character.toString(line.charAt(i)));
        }
        for (int i = 0; i < m; i++){
            String command = br.readLine();
            StringTokenizer st = new StringTokenizer(command, " ");
            switch (st.nextToken()){
                case "L" :
                    if (!leftStack.isEmpty()){
                        rightStack.push(leftStack.pop());
                    }
                    break;
                case "D" :
                    if (!rightStack.isEmpty()){
                        leftStack.push(rightStack.pop());
                    }
                    break;
                case "B" :
                    if (!leftStack.isEmpty()){
                        leftStack.pop();
                    }
                    break;
                case "P" :
                    leftStack.push(st.nextToken());
                    break;
            }
        }
        while(!leftStack.isEmpty()){
            rightStack.push(leftStack.pop());
        }
        while(!rightStack.isEmpty()){
            bw.write(rightStack.pop());
        }
        bw.flush();
    }
}
