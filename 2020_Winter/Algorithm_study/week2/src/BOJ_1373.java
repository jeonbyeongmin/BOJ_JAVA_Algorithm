import java.util.Scanner;

public class BOJ_1373 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        int start = 0;
        if (line.length() % 3 == 1){
            System.out.print(Integer.parseInt(line.substring(0, 1), 2));
            start = 1;
        }
        else if (line.length() % 3 == 2){
            System.out.print(Integer.parseInt(line.substring(0, 2), 2));
            start = 2;
        }
        while(start < line.length()){
            System.out.print(Integer.parseInt(line.substring(start, start+3),2));
            start += 3;
        }
    }
}
