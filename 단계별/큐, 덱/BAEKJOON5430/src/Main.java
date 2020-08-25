import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++){
            String func = sc.next();
            int num = sc.nextInt();
            String str = sc.next();
            String[] temp = str.split(",");
            Deque<String> list = new ArrayDeque<>();


            for (int j = 0; j < temp.length; j++){
                temp[j] = temp[j].replaceAll("[^0-9]", "");
                if (num == 0){
                    continue;
                } else{
                    list.add(temp[j]);
                }
            }

            int numberOfR = 0;
            boolean isError = false;

            for (int j = 0; j < func.length(); j++){
                if (func.charAt(j) == 'R') {
                    numberOfR++;
                } else{

                    if (numberOfR == 0 || numberOfR % 2 == 0){
                        if (list.isEmpty()){
                            isError = true;
                        } else{
                            list.removeFirst();
                        }
                    } else{
                        if (list.isEmpty()){
                            isError = true;
                        } else{
                            list.removeLast();
                        }
                    }
                }
            }
            int tempSize = list.size();
            if (isError){
                System.out.println("error");
            } else{
                System.out.print("[");
                if (numberOfR == 0 || numberOfR % 2 == 0) {
                    for (int j = 0; j < tempSize; j++){
                        if (j == tempSize-1){
                            System.out.print(list.removeFirst());
                        } else{
                            System.out.print(list.removeFirst() + ",");
                        }
                    }
                } else{
                    for (int j = 0; j < tempSize; j++){
                        if (j == tempSize-1){
                            System.out.print(list.removeLast());
                        } else{
                            System.out.print(list.removeLast() + ",");
                        }
                    }
                }
                System.out.println("]");
            }

        }

    }
}
