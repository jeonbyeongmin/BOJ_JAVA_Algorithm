import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputCount = Integer.parseInt(br.readLine());
        Arrays<Integer> arr = new Arrays<Integer>();
        for (int i = 0; i < inputCount; i++){
            arr.addA(Integer.parseInt(br.readLine()));
        }
        Collection.sort(arr);
        for (int i = 0; i < inputCount; i++){
            System.out.println(arr.get(i));
        }
    }
}
