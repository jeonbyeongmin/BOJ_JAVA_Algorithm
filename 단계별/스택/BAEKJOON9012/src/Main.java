import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++){
            LinkedList<Character> list = new LinkedList<>();
            String str = sc.next();
            boolean yesOrNo = true;

            for (int j = 0; j < str.length(); j++){
                if (str.charAt(j) == ')'){
                    if (list.isEmpty()){
                        yesOrNo = false;
                        break;
                    } else{
                        list.pop();
                    }
                }
                else {
                    list.push(str.charAt(j));
                }
            }
            if (yesOrNo && list.isEmpty()){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }

    }
}
