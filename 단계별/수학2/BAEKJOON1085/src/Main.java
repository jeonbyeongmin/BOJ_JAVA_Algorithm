import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int xMin = w;
        int yMin = h;

        if (x > w-x){
            xMin = w-x;
        } else{
            xMin = x;
        }

        if (y > h-y){
            yMin = h-y;
        } else{
            yMin = y;
        }

        if (xMin > yMin){
            System.out.println(yMin);
        } else {
            System.out.println(xMin);
        }
    }
}
