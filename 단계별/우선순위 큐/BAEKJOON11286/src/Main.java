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
            int x = sc.nextInt();
            if (x == 0){
                if (list.size() == 1){
                    System.out.println(0);
                } else{
                    System.out.println(removeHeap());
                }
            } else{
                addHeap(x);
            }
        }
    }
    public static void addHeap(int value){
        list.add(value);
        int target = list.size()-1;
        while(target > 1){
            if (Math.abs(list.get(target)) < Math.abs(list.get(target/2))){
                swap(target, target/2);
            } else if (Math.abs(list.get(target)) == Math.abs(list.get(target/2))){
                if (list.get(target) < list.get(target/2)){
                    swap(target, target/2);
                }
            } else{
                break;
            }
            target = target/2;
        }
    }
    public static int removeHeap(){
        int removeItem = list.get(1);
        int temp = list.get(list.size()-1);
        list.set(1, temp);
        list.remove(list.size()-1);
        int target = 1;

        while(target*2 <= list.size()-1){
            int min = list.get(target*2);
            int minIndex = target*2;
            if (target*2+1 <= list.size()-1 && Math.abs(min) > Math.abs(list.get(target*2+1))){
                min = list.get(target*2+1);
                minIndex = target*2+1;
            } else if (target*2+1 <= list.size()-1 && Math.abs(min) == Math.abs(list.get(target*2+1))){
                if (min > list.get(target*2+1)){
                    min = list.get(target*2+1);
                    minIndex = target*2+1;
                }
            }
            if (Math.abs(min) > Math.abs(list.get(target))){
                break;
            } else if (Math.abs(min) == Math.abs(list.get(target))){
                if (min > list.get(target)){
                    break;
                }
            }
            swap(minIndex, target);
            target = minIndex;
        }
        return removeItem;
    }

    public static void swap(int index_a, int index_b){
        int temp = list.get(index_a);
        list.set(index_a, list.get(index_b));
        list.set(index_b, temp);
    }
}
