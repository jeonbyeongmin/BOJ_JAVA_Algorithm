
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
            int cal = sc.nextInt();
            if (cal == 0){
                if (list.size() == 1){
                    System.out.println(0);
                } else{
                    System.out.println(heapRemove());
                }
            } else{
                heapAdd(cal);
            }
        }
    }
    public static void heapAdd(int a){
        list.add(a);
        int target = list.size()-1;
        while(target > 1){
            if (list.get(target/2) < list.get(target)){
                swap(target, target/2);
            } else{
                break;
            }
            target = target/2;
        }
    }

    public static int heapRemove(){
        int anw = list.get(1);
        int target = 1;
        list.set(1, list.get(list.size()-1));
        list.remove(list.size()-1);

        while(target*2 <= list.size()-1){

            // 왼쪽 자식을 max로 설정
            int max = list.get(target*2);
            int maxIndex = target*2;

            // 왼쪽 자식과 오른쪽 자식을 비교하여
            // 1. 오른쪽 자식이 존재하고
            // 2. 오른쪽 자식이 더 크다면
            // 3. max는 오른쪽 자식이다.
            if (target*2+1 <= list.size()-1 && max < list.get(target*2+1)){
                max = list.get(target*2+1);
                maxIndex = target*2+1;
            }

            // 부모의 원소값이 더 크다면 연산을 하지 않고 break한다
            if (list.get(target) > max){
                break;
            }

            // 자식의 원소값이 더 크면 그대로 maxIndex에 있는 값과
            // 부모에 있는 값을 swap 해준다
            swap(maxIndex, target);
            target = maxIndex;
        }
        return anw;
    }

    public static void swap(int a, int b){
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }
}
