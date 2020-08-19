import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String arr[] = str.split("-");

        String temp_0[] = arr[0].split("\\+");
        int sum_0 = 0;
        for (int j = 0; j < temp_0.length; j++){
            sum_0 = sum_0 + Integer.parseInt(temp_0[j]);
        }

        int result = sum_0;
        for (int i = 1; i < arr.length; i++){
            String temp[] = arr[i].split("\\+");
            int sum = 0;
            for (int j = 0; j < temp.length; j++){
                sum = sum + Integer.parseInt(temp[j]);
            }
            result = result - sum;

        }
        System.out.println(result);
    }
}
