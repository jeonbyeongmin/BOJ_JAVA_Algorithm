import java.util.Scanner;

public class Main { //BAEKJOON 1157 단어공부

    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        String givenWord = newScanner.next();
        int alphabetCount[] = new int[26];

        for (int i = 0; i < givenWord.length(); i++){
            alphabetCount[Character.toUpperCase(givenWord.charAt(i))-'A']++;
        }
        int maxNumber = -1;
        char maxAlphabet = '?';
        boolean isExist = false;
        for (int i = 0; i < 26; i++){
            if (maxNumber < alphabetCount[i]){
                maxNumber = alphabetCount[i];
                maxAlphabet = (char)('A' + i);
            }
        }
        for (int i = 0; i < 26; i++) {
            for (int j = i+1; j < 26; j++){
                if (alphabetCount[i] == maxNumber && alphabetCount[i] == alphabetCount[j]){
                    isExist = true;
                }
            }
        }
        if (isExist){
            System.out.println("?");
        } else{
            System.out.println(maxAlphabet);
        }
    }
}
