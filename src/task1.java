public class task1 {
    public static void printDigits(int n){
        if (n < 10){
            System.out.println(n);
        } else{
            printDigits(n/10);
            System.out.println(n%10);
        }
    }
    public static void main(String[] args) {
        int n = 5481;
        printDigits(n);
    }
}

