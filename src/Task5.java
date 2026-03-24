public class Task5 {
    public static int Fibonacci(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
    public static void main(String [] args){
        int n = 17;
        int result  = Fibonacci(n);
        System.out.println(result);
    }
}
