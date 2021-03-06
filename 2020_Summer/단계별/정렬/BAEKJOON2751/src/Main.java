import java.io.*;

public class Main {

    public static int[] src;
    public static int[] temp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int n = Integer.parseInt(br.readLine());
        src = new int[n];
        temp = new int[src.length];

        for (int i = 0; i < n; i++){
            src[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(0, src.length-1);

        for (int i = 0; i < n; i++){
            bw.write(Integer.toString(src[i]) + "\n");
        }

        bw.flush();
    }


    public static void mergeSort(int start, int end){
        if (start < end){


            /************************************************
             1. 더이상 분할할 수 없을 때까지 데이터 집합을 계속 반으로 나눈다.
             ************************************************/
            int mid = (start+end) / 2;
            mergeSort(start, mid);
            mergeSort(mid+1, end);




            /**************************************
             2. 분할된 두 배열의 첫번째 인덱스를 p와 q에 저장해준다.
             *************************************/
            int p = start;
            int q = mid + 1;


            /*********************************************
            3. temp라는 배열은 나누어진 두 배열을 비교하여 합병하기 위해
               임시로 만들어진 배열이고, 크기는 나눠진 두 배열의 크기의 합이다.
               temp 인덱스 처리를 위해 idx라는 int형 변수를 선언해준다
             *******************************************/
            int idx = p;



            /******************************************
            4. 나눠진 두 배열을 temp[]에 정렬과 동시에 합병
             ******************************************/
            while (p <= mid || q <= end){ //요소가 하나일 때도 반복문을 돌려주기 위해서.
                if (q > end || (p <= mid && src[p] < src[q])){ // 나뉜 두 요소 중 p에서 더 작거나, q에서 가져올 것이 없는 경우.
                    // if문 안에서 요소를 가져올 때마다 q++을 하기 때문에, q > end 라는 것이 곧 q에서 가져올 요소가 없다는 뜻이다.
                    temp[idx++] = src[p++];
                } else{ // 나뉜 두 요소 중 q에서 더 작거나, p에서 가져올 것이 없는 경우.
                    temp[idx++] = src[q++];
                }
            }



            /******************************************
             5. temp[]에 저장된 요소들을 다시 src[]에 가져온다.
             ******************************************/
            for (int i = start; i <= end; i++){
                src[i] = temp[i];
            }
        }
    }
}
