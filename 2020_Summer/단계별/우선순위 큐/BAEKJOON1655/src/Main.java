import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        list.add(0);
        for (int i = 0; i < n; i++){
            int number = sc.nextInt();

        }
    }
    public static void heapAdd(int val){
        list.add(val);
        int target = list.size()-1;
        while(target > 1){
            if (list.get(target) < list.get(target/2)){
                swap(target, target/2);
            } else{
                break;
            }
            target = target/2;
        }
    }
    public static void swap(int a, int b){
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }
}
