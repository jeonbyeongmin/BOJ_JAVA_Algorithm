import java.util.*;

public class BOJ_11656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        String[] lines = new String[line.length()];

        for (int i = 0; i < line.length(); i++){
            lines[i] = line.substring(i, line.length());
        }
        Arrays.sort(lines);

        for (String lin : lines){
            System.out.println(lin);
        }
    }
}
