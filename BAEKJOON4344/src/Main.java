import java.util.Scanner;

public class Main { //1차원배열
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int numberOfTest = newScanner.nextInt();
        double percent[] = new double[numberOfTest];

        for (int i = 0; i < numberOfTest; i++){ // test loop
            double overAverage = 0;
            double average = 0;
            double sum = 0;
            int numberOfStudent = newScanner.nextInt(); // 학생의 수 받기
            double score[] = new double[numberOfStudent];
            for (int j = 0; j < numberOfStudent; j++) { // score loop
                score[j] = newScanner.nextInt();
                sum = sum + score[j];
            }
            average = sum/numberOfStudent;

            for (int k = 0; k < numberOfStudent; k++){
                if(score[k] > average){
                    overAverage++;
                }
            }
            percent[i] = overAverage/numberOfStudent;
        }
        for (int i = 0; i < numberOfTest; i++){
            System.out.println(String.format("%.3f", Math.round(percent[i]*100000)/1000.0) + "%");
        }
    }
}
