import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfGlasses = sc.nextInt();
        int glasses[] = new int[Math.max(numberOfGlasses+1, 4)];
        int result[] = new int[Math.max(numberOfGlasses+1, 4)];

        for (int i = 1; i <= numberOfGlasses; i++){
            glasses[i] = sc.nextInt();
        }


        result[1] = glasses[1];
        result[2] = glasses[1] + glasses[2];
        result[3] = Math.max( (glasses[1]+glasses[2]) , Math.max( (glasses[2]+glasses[3]), (glasses[1]+glasses[3]) ) );

        for (int i = 4; i <= numberOfGlasses; i++){
            result[i] = Math.max(glasses[i]+glasses[i-1]+result[i-3], Math.max(result[i-1], glasses[i]+ result[i-2]));
        }
        System.out.println(result[numberOfGlasses]);
    }
}
