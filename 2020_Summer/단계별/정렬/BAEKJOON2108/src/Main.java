import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int number[] = new int[n];
        int count[] = new int[8001];
        int sortResult[] = new int[number.length];


        for (int i = 0; i < n; i++){
            number[i] = Integer.parseInt(br.readLine());
        }

        int maxNumber = 0;
        int mode = 0;
        for (int i = 0; i < number.length; i++){
            count[number[i]+4000]++;
            if (maxNumber < count[number[i]+4000]){
                maxNumber = count[number[i]+4000];
                mode = number[i];
            }
        }
        int modeCount = 0;
        for (int i = 0; i < count.length; i++){
            if (maxNumber == count[i]){
                if (maxNumber == count[i] && modeCount == 1){
                    mode = i -4000;
                }
                modeCount++;
            }
        }

        for (int i = 1; i < count.length; i++){
            count[i] = count[i] + count[i-1];
        }


        for (int i = number.length-1; i >= 0; i--){
            count[number[i]+4000]--;
            sortResult[count[number[i]+4000]] = number[i];
        }
        int range = sortResult[n-1] - sortResult[0];


        // 산술평균 구하기.
        double sum = 0;
        for (int i = 0; i < sortResult.length; i++){
            sum = sum + sortResult[i];
        }
        double arithmeticMean = sum / sortResult.length;

        System.out.println(Math.round(arithmeticMean));

        // 중앙값.
        System.out.println(sortResult[sortResult.length/2]);

        // 최빈값
        System.out.println(mode);

        System.out.println(Math.abs(range));
    }
}
