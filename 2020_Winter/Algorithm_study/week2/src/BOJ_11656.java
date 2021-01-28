import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ_11656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        String[] lines = new String[line.length()];

        for (int i = 0; i < line.length(); i++){
            lines[i] = line.substring(i, line.length());
        }

        Arrays.sort(lines, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for (String lin : lines){
            System.out.println(lin);
        }
    }
}
