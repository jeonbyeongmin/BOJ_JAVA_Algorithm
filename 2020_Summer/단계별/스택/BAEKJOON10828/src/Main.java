
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        LinkedList<Integer> list = new LinkedList();

        for (int i = 0; i < N; i++){
            String input = sc.next();
            switch (input){
                case "push" :
                    list.push(sc.nextInt());
                    break;
                case "pop" :
                    if (list.isEmpty()){
                        System.out.println("-1");
                    } else{
                        System.out.println(list.pop());
                    }
                    break;
                case "size" :
                    System.out.println(list.size());
                    break;
                case "empty" :
                    if (list.isEmpty()){
                        System.out.println("1");
                    } else{
                        System.out.println("0");
                    }
                    break;
                case "top" :
                    if (list.isEmpty()){
                        System.out.println("-1");
                    } else{
                        System.out.println(list.getFirst());
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
