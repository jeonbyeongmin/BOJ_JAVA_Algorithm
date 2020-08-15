import java.util.Scanner;

public class Main { //lcs
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String one = sc.next();
        String two = sc.next();
        int result[][] = new int[one.length()+1][two.length()+1];

        for (int i = 1; i <= one.length(); i++){
            for (int j = 1; j <= two.length(); j++){
                if (one.charAt(i-1) == two.charAt(j-1)){
                    result[i][j] = result[i-1][j-1]+1;
                } else {
                    result[i][j] = Math.max(result[i-1][j], result[i][j-1]);
                }
            }
        }
        System.out.println(result[one.length()][two.length()]);
    }
}
