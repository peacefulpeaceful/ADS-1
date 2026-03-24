public class Task7 {
    public static void reverseOfArray(int[] arr, int n){
        if (n == 0){
            return;
        }
        System.out.print(arr[n-1] + " ");
        reverseOfArray(arr, n-1);
    }
    public static void main(String[] args){
            int[] arr = {1, 4, 6, 2};
            int size = arr.length;
            reverseOfArray(arr, size);
    }
}
