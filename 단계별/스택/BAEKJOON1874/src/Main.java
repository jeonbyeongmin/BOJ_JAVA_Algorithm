import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        boolean isRight = true;

        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        Stack<Integer> list = new Stack<>();

        int count = 1;
        char[] result = new char[n*2];
        int resultCount = 0;

        for (int i = 0; i < n; i++){
            while(count <= a[i]){
                result[resultCount] = '+';
                resultCount++;
                list.push(count);
                count++;
            }
            if (list.lastElement() == a[i]){
                result[resultCount] = '-';
                resultCount++;
                list.pop();
            } else{
                isRight = false;
            }
        }

        if (isRight){
            for (char value : result){
                System.out.println(value);
            }
        } else{
            System.out.println("NO");
        }
    }
}
