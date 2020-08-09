import java.util.Scanner;

public class Main {

    public static int n;
    public static int col[];
    public static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        col = new int[n];
        dfs(0);
        System.out.println(count);

    }
    public static void dfs(int column){
        if (column == n){
            count++;
        } else{
            for (int row = 0; row < n; row++){
                col[column] = row;
                if (isPossible(column)){
                    dfs(column+1);
                }
            }
        }
    }

    public static boolean isPossible(int column){
        for (int i = 0; i < column; i++){
            if (col[i] == col[column]) { // row가 같은 곳은 유망X column은 dfs동안에 어차피 1씩 증가해서 같을리가 없음.
                return false;
            }else if (Math.abs(column - i) == Math.abs(col[column] - col[i])) { // 대각선으로 같은 곳은 유망X
                return false;
            }
        }
        return true;
    }
}
