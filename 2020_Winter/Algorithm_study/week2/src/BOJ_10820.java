import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while((line = br.readLine()) != null){

            int upperCount = 0;
            int lowerCount = 0;
            int numbCount = 0;
            int blankCount = 0;

            for (int i = 0; i < line.length(); i++){
                if (line.charAt(i) >= 65 && line.charAt(i) <= 90){
                    upperCount++;
                } else if (line.charAt(i) >= 97 && line.charAt(i) <= 122){
                    lowerCount++;
                } else if (line.charAt(i) >= 48 && line.charAt(i) <= 57){
                    numbCount++;
                } else if (line.charAt(i) == ' '){
                    blankCount++;
                }
            }
            System.out.println(lowerCount + " " + upperCount + " " + numbCount + " " + blankCount);
        }
    }
}
