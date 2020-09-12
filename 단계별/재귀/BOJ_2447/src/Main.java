import java.util.Scanner;

public class Main {
    static char[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        arr = new char[input][input];

        star(0, 0, input, false);

        for (int i = 0; i < input; i++){
            for (int j = 0; j < input; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void star(int x, int y, int size, boolean isBlank){
        if (isBlank){
            for (int i = x; i < x + size; i++){
                for (int j = y; j < y + size; j++){
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if (size == 1){
            arr[x][y] = '*';
            return;
        }
        int sizeDivided = size/3;
        int count = 0;
        for (int i = x; i < x+size; i += sizeDivided) { // i = i + sizeDevided
            for (int j = y; j < y + size; j += sizeDivided) { // j = j + sizeDivided 9라면 3씩 증가.
                count++;
                if (count == 5) {
                    star(i, j, sizeDivided, true);
                } else {
                    star(i, j, sizeDivided, false);
                }
            }
        }
    }
}


