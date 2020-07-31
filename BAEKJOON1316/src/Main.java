import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int inputNumber = newScanner.nextInt(); // 첫 줄에 단어의 개수 N이 들어온다.
        int groupWordCount = inputNumber; // 정답의 최댓값을 설정해준다.

        for (int i = 0; i < inputNumber; i++){ // 단어의 개수만큼 문자열을 받기 위해서 반복문을 써준다.
            String inputStr = newScanner.next();
            boolean isExist[] = new boolean[26]; // 각 알파벳이 나왔었는지 판단해주기 위해서 boolean형 배열을 선언해준다.

            for (int j = 1; j < inputStr.length(); j++){ // 각 단어마다 알파벳 개수 만큼 반복해준다.
                if (inputStr.charAt(j-1) != inputStr.charAt(j)) {
                    isExist[inputStr.charAt(j-1)-97] = true; // 해당 알파벳이 등장했으므로 boolean값을 true로 바꿔준다.
                    if (isExist[inputStr.charAt(j)-97] == true){ // 알파벳이 나왔었다면,
                        groupWordCount--; // 그룹단어가 아님.
                        break; // 이 단어는 더이상 판단할 것이 없으므로 break;
                    }
                }
            }
        }
        System.out.println(groupWordCount);
    }
}
