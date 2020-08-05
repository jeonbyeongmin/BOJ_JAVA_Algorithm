import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        String s = newScanner.next();
        int alphabet[] = new int[26]; //알파벳 개수
        for (int i = 0; i < 26; i++){ //알파벳 배열 -1로 초기
            alphabet[i] = -1;
        }
        for (int i = 0; i < s.length(); i++){
            if (alphabet[s.charAt(i)-'a'] == -1){
                alphabet[s.charAt(i)-'a'] = i;
            }
        }
        for (int i = 0; i < 26; i++){
            System.out.print(alphabet[i] + " ");
        }
    }
}
