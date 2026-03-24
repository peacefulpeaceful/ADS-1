public class task2 {
    public static int avarageSum(int [] arr, int n){
        if (n == 0){
            return 0;
        }else{
            return arr[n - 1] + avarageSum(arr, n - 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1};
        int n = arr.length;

        double avg = (double) avarageSum(arr, n) / n;
        System.out.println(avg);
    }
}
