
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int numberOfTest = newScanner.nextInt();
        int x, y;
        for (int i = 0; i < numberOfTest; i++){
            int height = newScanner.nextInt();
            int width = newScanner.nextInt();
            int numberOfGuests = newScanner.nextInt();

            if (numberOfGuests%height == 0){
                y = height;
                x = numberOfGuests/height;
            } else{
                y = numberOfGuests%height;
                x = numberOfGuests/height+1;
            }
            System.out.println(y*100 + x);
        }
        newScanner.close();
    }
}
