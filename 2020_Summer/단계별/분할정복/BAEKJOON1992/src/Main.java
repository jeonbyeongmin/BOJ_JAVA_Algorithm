import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Main {
    public static char[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new char[N][N];

        for (int i = 0; i < N; i++){
            String str = sc.next();
            for (int j = 0; j < N; j++){
                arr[i][j] = str.charAt(j);
            }
        }
        func(0, 0, N);


    }
    public static void func(int a, int b, int size){

        if (size == 1){
            System.out.print(arr[a][b]);
        } else{
            if (check(a, b, size)){
                System.out.print(arr[a][b]);
            } else{
                System.out.print("(");
                func(a, b, size/2);
                func(a, b+(size/2), size/2);
                func(a+(size/2), b, size/2);
                func(a+(size/2), b+(size/2), size/2);
                System.out.print(")");
            }
        }

    }

    public static boolean check(int a, int b, int size){
        for (int i = a; i < a+size; i++){
            for (int j = b; j < b+size; j++){
                if (arr[a][b] == '1'){
                    if (arr[i][j] != '1'){
                        return false;
                    }
                } else{
                    if (arr[i][j] != '0'){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
