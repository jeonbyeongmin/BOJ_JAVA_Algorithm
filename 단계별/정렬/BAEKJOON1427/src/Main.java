
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputNumber = br.readLine();
        char number[] = new char[inputNumber.length()];
        for (int i = 0; i < inputNumber.length(); i++){
            number[i] = inputNumber.charAt(i);
        }
        Arrays.sort(number);
        for (int i = inputNumber.length()-1; i >= 0; i--){
            System.out.print(number[i]);
        }
    }
}
