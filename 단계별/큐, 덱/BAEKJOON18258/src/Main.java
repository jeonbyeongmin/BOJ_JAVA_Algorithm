import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> que = new LinkedList<>();
        StringTokenizer st;

        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String inputStr = st.nextToken();
            switch (inputStr){

                case "push" :
                    que.add(Integer.parseInt(st.nextToken()));
                    break;

                case "pop" :
                    if (que.isEmpty()){
                        bw.write(-1+"\n");
                    } else{
                        bw.write(que.remove()+"\n");
                    }
                    break;

                case "size" :
                    bw.write(que.size()+"\n");
                    break;

                case "empty" :
                    if (que.isEmpty()){
                        bw.write(1+"\n");
                    } else {
                        bw.write(0+"\n");
                    }
                    break;

                case "front" :
                    if (que.isEmpty()) {
                        bw.write(-1+"\n");
                    } else{
                        bw.write(que.getFirst()+"\n");
                    }
                    break;

                case "back" :
                    if (que.isEmpty()){
                        bw.write(-1+"\n");
                    } else{
                        bw.write(que.getLast()+"\n");
                    }
                    break;

                default:
                    break;
            }
        }

        bw.close();
    }
}
