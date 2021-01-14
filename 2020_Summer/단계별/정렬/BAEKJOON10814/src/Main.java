import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        String people[][] = new String[inputNumber][2];

        for (int i = 0; i < inputNumber; i++) {
            people[i][0] = sc.next();
            people[i][1] = sc.next();
        }

        Arrays.sort(people, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (Integer.parseInt(o1[0]) > Integer.parseInt(o2[0])){
                    return 1;
                } else if (Integer.parseInt(o1[0]) == Integer.parseInt(o2[0])){
                    return 0;
                }
                return -1;
            }
        });
        for (int i = 0; i < inputNumber; i++) {
            System.out.println(people[i][0] + " " + people[i][1]);
        }
    }
}
