import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException { // BOJ10989 정답.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count[] = new int[10001]; // 0 ~ 10000 까지 10001가 나올 수 있다.

        for (int i = 0; i < n; i++){
            count[Integer.parseInt(br.readLine())]++; // 각각의 숫자가 나올 때마다 해당 인덱스를 카운팅 해줄 것.
        }
        for (int i = 0; i < count.length; i++){
            while(count[i] > 0){
                bw.write(Integer.toString(i) + "\n");
                count[i]--;

            }
        }

        bw.close();
    }
//    public static void main(String[] args){ // 카운팅 정렬에 대한 공부
//
//        int a[] = new int[10];
//        int c[] = new int[20];
//        int b[] = new int[a.length];
//
//        for(int i = 0; i < a.length; i++) {
//            a[i] = (int)(Math.random()*20);
//        }
//
//        for (int i = 0; i < a.length; i++) {
//           c[a[i]]++;
//        }
//        for (int i = 1; i < c.length; i++){
//           c[i] = c[i] + c[i-1];
//        }
//        for (int i = a.length-1; i >= 0; i--){
//           c[a[i]]--;
//           b[c[a[i]]] = a[i];
//        }
//
//
//        //출력.
//        for (int i = 0; i < a.length; i++){
//            System.out.print(" | " + a[i]);
//        }
//        System.out.println();
//        for (int i = 0; i < b.length; i++){
//            System.out.print(" | " + b[i]);
//        }
//    }
}
