import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        int result[] = new int[N];

        for (int i = 1; i <= N; i++){
            list.add(i);
        }

        int count = 1;
        while(list.size() != 0){
            if (count == K){
                result[N-list.size()] = list.pop();
                count = 1;
            } else{
                list.add(list.remove());
                count++;
            }
        }

        System.out.print("<");
        int tmp = 0;
        for (int value : result){
            if (tmp == result.length-1){
                System.out.print(value);
            } else{
                System.out.print(value + ", ");
            }
            tmp++;
        }
        System.out.println(">");
    }
}
