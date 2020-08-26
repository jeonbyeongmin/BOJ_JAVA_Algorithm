import java.util.Scanner;

public class Main {
    public static int arr[][];
    public static int zeroCount = 0;
    public static int oneCount = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new int[N][N];

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        func(0, 0, N);

        System.out.println(zeroCount);
        System.out.println(oneCount);
    }

    public static void func(int a, int b, int size){
        if (size == 1){
            if (arr[a][b] == 1){
                oneCount++;
            } else{
                zeroCount++;
            }
        } else{
            if (check(a, b, size)){
                if (arr[a][b] == 1){
                    oneCount++;
                } else{
                    zeroCount++;
                }
            } else{
                func(a, b, size/2);
                func(a, b+(size/2), size/2);
                func(a+(size/2), b, size/2);
                func(a+(size/2), b+(size/2), size/2);
            }
        }
    }

    public static boolean check(int a, int b, int size){
        for (int i = a; i < a+size; i++){
            for (int j = b; j < b+size; j++){
                if(arr[a][b] == 1){
                    if (arr[i][j] != 1){
                        return false;
                    }
                } else{
                    if (arr[i][j] != 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
