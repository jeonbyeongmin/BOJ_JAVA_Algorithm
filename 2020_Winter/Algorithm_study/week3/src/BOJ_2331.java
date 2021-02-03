import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_2331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int p = sc.nextInt();

        List<String> list = new ArrayList<>();
        list.add(a);

        while(true){
            String currentNumber = list.get(list.size()-1);
            int nextNumber = 0;
            for (int i = 0; i < currentNumber.length(); i++){
                nextNumber += Math.pow(Character.getNumericValue(currentNumber.charAt(i)), p);
            }
            if (list.contains(Integer.toString(nextNumber))){
                System.out.println(list.indexOf(Integer.toString(nextNumber)));
                break;
            }
            list.add(Integer.toString(nextNumber));
        }
    }
}
