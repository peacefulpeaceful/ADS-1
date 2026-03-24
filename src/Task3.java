public class Task3 {
    public static boolean isPrime(int n, int i){
        if (n<=1){
            return false;
        }
        if (i == 1){
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return isPrime(n, i-1);
    }

    public static void main(String[] args){
        int n = 10;
        if (isPrime(n, n/2)){
            System.out.println("PRime");
        }else{
            System.out.println("COmposite");
        }
    }
}
