import java.util.Scanner;

public class Main {
    public static int number[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        number = new int[m];

        dfs(n, m, 0, 0);


    }
    public static void dfs(int n, int m, int depth, int a){
        if (depth == m){
            for (int value : number){
                System.out.print(value + " ");
            }
            System.out.println();
        } else {
            for (int i = a; i < n; i++){
                number[depth] = i+1;
                dfs(n, m, depth+1, i+1);

            }
        }
    }
}
