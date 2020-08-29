import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        List<Integer> list = new ArrayList<>();
        list.add(0);
        // arr를 돌며 증가하는 부분 수열을 list에 추가해줄 것

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            int value = arr[i];

            if (value > list.get(list.size()-1)) {
                // list의 마지막 원소보다 value가 크면 리스트에 value를 추가함
                list.add(value);
            } else{
                // list의 마지막 원소보다 value가 크지 않다면 리스트가 가지고 있는 원소를 value로 대체
                int start = 0;
                int end = list.size()-1;

                while(end - start >= 0){
                    int mid = (start+end)/2;
                    if (list.get(mid) >= value){
                        end = mid-1;
                    } else{
                        start = mid + 1;
                    }
                }
                list.set(start, value);
            }
        }
        System.out.println(list.size()-1);
    }
}
