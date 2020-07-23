public class Main { //self number
    public static void main(String[] args) {
        int arr[] = new int[10036];
        for (int i = 1; i <= 10000; i++){
            arr[d(i)] = 1;
            if (arr[i] != 1) {
                System.out.println(i);
            }
        }
    }
    public static int d(int n){
        int sum = n;
        while(n >= 1){
            sum = sum + n%10;
            n = n/10;
        }
        return sum;
    }
}
