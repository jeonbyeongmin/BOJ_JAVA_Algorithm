import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        while(true){
            if (str.length()==1 && str.charAt(0) == '.'){
                break;
            }
            LinkedList<Character> list = new LinkedList<>();
            boolean yesOrNo = true;
            for (int i = 0; i < str.length(); i++){
                switch (str.charAt(i)){
                    case '(' :
                        list.push(str.charAt(i));
                        break;
                    case '[' :
                        list.push(str.charAt(i));
                        break;
                    case ')' :
                        if (list.isEmpty()){
                            yesOrNo = false;
                        } else{
                            if (list.getFirst() == '['){
                                yesOrNo = false;
                            } else{
                                list.pop();
                            }
                        }
                        break;
                    case ']' :
                        if (list.isEmpty()){
                            yesOrNo = false;
                        } else{
                            if (list.getFirst() == '('){
                                yesOrNo = false;
                            } else{
                                list.pop();
                            }
                        }
                        break;
                    default:
                        break;
                }
            }
            if (yesOrNo && list.isEmpty()){
                System.out.println("yes");
            } else{
                System.out.println("no");
            }
            str = sc.nextLine();
        }
    }
}
