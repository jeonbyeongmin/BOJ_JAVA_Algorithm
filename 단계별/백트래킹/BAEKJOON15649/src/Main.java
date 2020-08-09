import java.util.Scanner;


/*
Backtraking은 어떤 노드의 유망성을 '판단'한뒤 유망하지 않다면
부모 노드로 돌아가 다른 자식 노드를 찾는 방법이다.
 */

public class Main {
    public static int number[]; // 출력할 숫자를 담는 배열
    public static boolean check[]; // 다음 노드를 검사하여 이미 방문한 노드인지 판단하는 배열. 여기서 노드는 숫자를 가리킨다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        number = new int[m];
        check = new boolean[n];

        dfs(n, m, 0);

    }
    public static void dfs(int n, int m, int depth){
        if (depth == m){
            for (int value : number){
                System.out.print(value + " ");
            }
            System.out.println();
        } else{

            for (int i = 0; i < n; i++){
                if (check[i] == false){ //방문하지 않은 노드일때만.
                    check[i] = true;
                    number[depth] = i+1; // depth는 0~m까지 존재.
                    dfs(n, m, depth+1); //check[i] = true 인채, number[depth] = i+1 인채로 돌게된다.
                    check[i] = false;
                }
            }

        }
    }
}
