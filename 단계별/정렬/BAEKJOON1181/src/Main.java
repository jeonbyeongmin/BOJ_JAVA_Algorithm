import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList arr = new ArrayList<String>();
        int inputNumber = Integer.parseInt(br.readLine());

        /*
        1. 길이 짧은순
        2. 길이 같으면 알파벳순
        3. 중복 X
         */

        // 리스트에 들어있는지 확인하고 없을 때만 add. --> 3번 해결
        for (int i = 0; i < inputNumber; i++){
            String temp = br.readLine();
            if (arr.contains(temp)){
                continue;
            } else{
                arr.add(temp);
            }
        }

        // 비교 정렬 1번 해결.
        arr.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()){
                    return o1.compareTo(o2); //글자수 같으면 알파벳순. 2번 해결.
                } else if (o1.length() > o2.length()){
                    return 1;
                } else{
                    return -1;
                }
            }
        });

        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}
