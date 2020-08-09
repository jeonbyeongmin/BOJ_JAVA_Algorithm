import java.util.Scanner;

public class Main {
    public static int number[];
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        number = new int[m];
        dfs(n, m, 0);

        System.out.println(sb);
    }

    static void dfs(int n, int m, int depth){
        if (depth == m){
            for (int value : number){
                sb.append(value + " ");
            }
            sb.append('\n');
        } else{
            for (int i = 1; i <= n; i++){
                number[depth] = i;
                dfs(n, m, depth+1);
            }
        }
    }
}
